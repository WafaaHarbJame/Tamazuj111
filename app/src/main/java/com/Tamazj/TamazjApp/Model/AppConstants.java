package com.Tamazj.TamazjApp.Model;

public interface AppConstants {
    String KEY_SIGN_UP = "KEY_SIGN_UP";
    String EMAIL = "EMAIL";
    String PASSWORD = "PASSWORD";
    String ACCOUNT_TYPE = "ACCOUNT_TYPE";
    String Beneficiary = "Beneficiary";
    String Advisor = "Advisor";
    String RATING_5 = "5";
    String RATING_4 = "4";
    String RATING_3 = "3";
    String RATING_2 = "2";
    String RATING_1 = "1";
    String HAPPY = "HAPPY";
    String SATISFIED = "SATISFIED";
    String NOT_SATISFIED = "NOT_SATISFIED";
    String CONSULT_TYPE = "CONSULT_TYPE";
    String SESSION_TYPE = "SESSION_TYPE";
    String FIRST_SESSION = "1";
    String SECOND_SESSION = "2";
    String THIRD_SESSION = "3";
    String SPECIAL_SESSION = "4";
    String toolbartiltle = "toolbartiltle";
    String ACTIVE = "الحساب  مفعل ";
    String NOT_ACTIVE = "الحساب غير مفعل";
    String ADVISOR_ID = "ADVISOR_ID";
    String CATEGORY_ID = "CATEGORY_ID";
    String Sub_CATEGORY_ID = "Sub_CATEGORY_ID";
    String Consultation_ID = "Consultation_ID";
    String CATEGORY_TYPE = "CATEGORY_TYPE";
    String token = "token";
    String ISLOGIN = "ISLOGIN";
    String FCM_TOKEN = "FCM_TOKEN";
    String LANG_choose = "LANG_choose";
    String SUCCESS = "تم بنجاح";

    //-----------------------------APIs-------------------------------------------------------------

    String USER_REGISTER = "http://salahalimohamed.website/tmajog/api/v1/user/register";
    String USER_LOGIN = "http://salahalimohamed.website/tmajog/api/v1/user/login";
    String activateCode = "http://salahalimohamed.website/tmajog/api/v1/user/activateCode";
    String USER_LOGOUT = "http://salahalimohamed.website/tmajog/api/v1/user/logout";
    String resetPass ="http://salahalimohamed.website/tmajog/api/v1/user/resetPass" ;
    String USER_PROFILE="http://salahalimohamed.website/tmajog/api/v1/user/profile";
    String updateProfile="http://salahalimohamed.website/tmajog/api/v1/user/updateProfile";
    String resetCode="http://salahalimohamed.website/tmajog/api/v1/user/resetCode";
    String session_times="http://salahalimohamed.website/tmajog/api/v1/session-times";
    String countries ="http://salahalimohamed.website/tmajog/api/v1/countries";
    String updatePassword ="http://salahalimohamed.website/tmajog/api/v1/user/updatePassword";
    String ADVISORS_CONSULTANTS = "http://salahalimohamed.website/tmajog/api/v1/consultants";
    String ADVISOR_CONSULTANT = "http://salahalimohamed.website/tmajog/api/v1/consultants/";
    String CATEGORIES = "http://salahalimohamed.website/tmajog/api/v1/category-of-consultations";
    String CATEGORY = "http://salahalimohamed.website/tmajog/api/v1/category-of-consultations/";
    String Sub_CATEGORY = "http://salahalimohamed.website/tmajog/api/v1/category-of-consultations/";
    String user_consultation = "http://salahalimohamed.website/tmajog/api/v1/user/consultation";
    String user_consultation_details = "http://salahalimohamed.website/tmajog/api/v1/user/consultation/";
    String HOME = "http://salahalimohamed.website/tmajog/api/v1/user/home";
    String FEEDBACK = "http://salahalimohamed.website/tmajog/api/v1/consultants/feedback/";
    //----------------------------------------------------------------------------------------------
}
