package com.felixtechlabs.jalgaonKeliAdmin;

import com.google.android.gms.common.internal.Constants;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DatabaseReferenceManager {

    private class ReferenceKeys

    {
        final static String USERS = "users";
    }


   final static String ENVIRONMENT = "Developement";

    private CollectionReference getDatabaseReference() {
        return FirebaseFirestore.getInstance().collection(ENVIRONMENT);
    }

    private void getUserReference() {
         getDatabaseReference().document(ReferenceKeys.USERS).collection(ReferenceKeys.USERS);
    }
}

