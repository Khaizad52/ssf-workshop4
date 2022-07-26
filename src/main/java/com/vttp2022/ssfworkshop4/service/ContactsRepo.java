package com.vttp2022.ssfworkshop4.service;

import com.vttp2022.ssfworkshop4.model.Contact;

public interface ContactsRepo {
    public void save(final Contact ctc);

    public Contact findById(final String contactId);
    
}
