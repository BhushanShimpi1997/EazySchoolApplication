package com.eazybytes.eazyschool.service;


import com.eazybytes.eazyschool.constants.EasySchoolConstants;
import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ContactService {

    private ContactRepository contactRepository;
    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public boolean saveMessageDetails(Contact contact){
        boolean isSaved=false;
        contact.setStatus(EasySchoolConstants.OPEN);
        Contact saveContact=contactRepository.save(contact);
        if (null !=saveContact && saveContact.getContactId()>0){
            isSaved=true;
        }
        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact>contactMsgs=contactRepository.findByStatus(EasySchoolConstants.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int id) {
        boolean isUpdated=false;
        Optional<Contact>contact=contactRepository.findById(id);
        contact.ifPresent(contact1 -> {
            contact1.setStatus(EasySchoolConstants.CLOSE);
        });
        Contact updatedContact=contactRepository.save(contact.get());
        if(null !=updatedContact && updatedContact.getUpdatedBy() !=null){
            isUpdated=true;
        }
        return isUpdated;
    }
}
