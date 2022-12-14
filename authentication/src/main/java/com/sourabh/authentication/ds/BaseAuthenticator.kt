//package com.sourabh.authentication.ds
//
//interface BaseAuthenticator {
//
//    //this class will implement all the basic authentication api calls. Using this method of abstraction
//    //will allow us to implement any type of authentication api may it be
//    //that you have built your own or Firebase auth sdks. This makes it easy to swap
//    //in the future because all authentication classes you will use will inherit behaviour from this base class.
//    //Also in testing it will make it easy to swap your actual sdks with fake ones
//
//    //suspend fun signUpWithEmailPassword(details: SignUpDetails) : FirebaseUser?
//    suspend fun signUpWithEmailPassword(details: SignUpDetails,completion: RequestCompletion<*>)
//
//    suspend fun signInWithEmailPassword(email: String , password: String,  completion: RequestCompletion<*>)
//
//    suspend fun sendPasswordReset(email :String,  completion: RequestCompletion<*>)
//}
