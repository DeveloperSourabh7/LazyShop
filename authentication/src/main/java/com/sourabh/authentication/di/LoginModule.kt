//package com.sourabh.authentication.di
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//
//@Module
//@InstallIn(SingletonComponent::class)
//object LoginModule {
//
//    @Singleton
//    @Provides
//    fun provideFirebaseLoginAuth(): BaseAuthenticator {
//        return FirebaseAuthenticator()
//    }
//
//    @Singleton
//    @Provides
//    fun provideFirebaseLoginRepo(): BaseAuthRepository {
//        return LoginRegistrationRepo(provideFirebaseLoginAuth())
//    }
//}