package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;


@Controller
@Slf4j
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    //Logger log = Logger.getLogger("ContactController.class");

    @RequestMapping("/contact")
    public String displayContactPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact.html";
    }

  /*  @RequestMapping(path = "/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email,@RequestParam String subject,
                                     @RequestParam String message)

    {
          log.info("Name:"+name);
          log.info("Mobile Number: "+mobileNum);
          log.info("email: "+email );
          log.info("subject: "+subject);
          log.info("Message: "+message);
          return new ModelAndView("redirect:/contact");
    }*/

    @RequestMapping(path = "/saveMsg", method = RequestMethod.POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if (errors.hasErrors()) {
            log.info("Contact Form validations failed due to: " + errors.toString());
            return "contact.html";
        }
        boolean result = contactService.saveMessageDetails(contact);
        log.info("info" + result);
        return "redirect:/contact";
    }

    @RequestMapping(value = "/displayMessages", method = RequestMethod.GET)
    public ModelAndView displayMessages(Model model) {
        List<Contact> contactMsgs = contactService.findMsgsWithOpenStatus();
        ModelAndView md = new ModelAndView();
        md.setViewName("messages.html");
        md.addObject("contactMsgs", contactMsgs);
        return md;

    }
    @RequestMapping(value="/closeMsg",method = RequestMethod.GET)
    public String closeMsg(@RequestParam int id){
        contactService.updateMsgStatus(id);
         return "redirect:/displayMessages";
    }
}
