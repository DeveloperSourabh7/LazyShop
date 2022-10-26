//package com.sourabh.authentication.ds
//import com.google.firebase.auth.ktx.auth
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase
//import kotlinx.coroutines.tasks.await
//import psl.coviassist.commonutilities.utils.CoviFailure
//import psl.coviassist.commonutilities.utils.CoviSuccess
//import psl.coviassist.commonutilities.utils.RequestCompletion
//import psl.coviassist.loginregistration.model.SignUpDetails
//import javax.inject.Inject
//
//class FirebaseAuthenticator @Inject constructor() : BaseAuthenticator {
//
//
//    override suspend fun signUpWithEmailPassword(details: SignUpDetails, completion: RequestCompletion<*>){
//        return try {
//
//            val result  = Firebase.auth.createUserWithEmailAndPassword(details.email.get().toString(),
//                details.password.get().toString()).await()
//            sendData(details,result.user?.uid.toString())
//
//            result.user?.sendEmailVerification()
//            completion(CoviSuccess(result.user))
//        } catch (e: Exception) {
//            completion(CoviFailure(e))
//        }
//    }
//    private fun sendData(details: SignUpDetails, uid: String){
//        val meMap = HashMap<String, String>()
//        meMap["name"] = details.name.get().toString()
//        meMap["mobile"] = details.mobile.get().toString()
//        meMap["email"] = details.email.get().toString()
//        Firebase.firestore.collection("User").document(uid).set(meMap)
//    }
//    override suspend fun signInWithEmailPassword(email: String, password: String, completion: RequestCompletion<*>) {
//        return try {
//            val result = Firebase.auth.signInWithEmailAndPassword(email, password).await()
//            completion(CoviSuccess(result.user))
//        } catch (e: Exception) {
//            completion(CoviFailure(e))
//        }
//    }
//    override suspend fun sendPasswordReset(email: String,  completion: RequestCompletion<*>){
//        return try {
//            Firebase.auth.sendPasswordResetEmail(email).await()
//            completion(CoviSuccess(Firebase.auth.sendPasswordResetEmail(email).isSuccessful))
//        } catch (e: Exception) {
//            completion(CoviFailure(e))
//        }
//    }
//}