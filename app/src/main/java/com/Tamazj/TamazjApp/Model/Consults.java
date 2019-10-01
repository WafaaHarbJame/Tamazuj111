package com.Tamazj.TamazjApp.Model;

import java.util.List;

public class Consults {


    /**
     * data : [{"id":21,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار",
     * "session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},
     * "start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب",
     * "name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":24,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":25,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":26,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":27,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":28,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":29,"means_of_communication":"video","summary_problem":"test test","rating":"4","status":"الاستشارة مكتملة","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":"2019-09-28 15:08:17","end_session":"2019-09-28 15:08:17","category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":"test test"},{"id":30,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null}]
     * "name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":24,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":25,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":26,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":27,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":28,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null},{"id":29,"means_of_communication":"video","summary_problem":"test test","rating":"4","status":"الاستشارة مكتملة","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":"2019-09-28 15:08:17","end_session":"2019-09-28 15:08:17","category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":"test test"},{"id":30,"means_of_communication":"video","summary_problem":"test test","rating":null,"status":"الاستشارة قيد الانتظار","session_time":{"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null},"start_session":null,"end_session":null,"category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"sub_category_id":{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},"consultant_id":{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},"note":null}]
     * links : {"first":"http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=1","last":"http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=2","prev":null,"next":"http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=2"}
     * meta : {"current_page":1,"from":1,"last_page":2,"path":"http://salahalimohamed.website/tmajog/api/v1/user/consultation","per_page":8,"to":8,"total":11,"message":"تم العرض بنجاح","status":1}
     */

    private LinksBean links;
    private MetaBean meta;
    private List<DataBean> data;

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class LinksBean {
        /**
         * first : http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=1
         * last : http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=2
         * prev : null
         * next : http://salahalimohamed.website/tmajog/api/v1/user/consultation?page=2
         */

        private String first;
        private String last;
        private Object prev;
        private String next;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public Object getPrev() {
            return prev;
        }

        public void setPrev(Object prev) {
            this.prev = prev;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }
    }

    public static class MetaBean {
        /**
         * current_page : 1
         * from : 1
         * last_page : 2
         * path : http://salahalimohamed.website/tmajog/api/v1/user/consultation
         * per_page : 8
         * to : 8
         * total : 11
         * message : تم العرض بنجاح
         * status : 1
         */

        private int current_page;
        private int from;
        private int last_page;
        private String path;
        private int per_page;
        private int to;
        private int total;
        private String message;
        private int status;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class DataBean {
        /**
         * id : 21
         * means_of_communication : video
         * summary_problem : test test
         * rating : null
         * status : الاستشارة قيد الانتظار
         * session_time : {"id":1,"time":"30","price":"50.00","created_at":"2019-09-18 19:05:17","updated_at":"2019-09-18 19:05:17","deleted_at":null}
         * start_session : null
         * end_session : null
         * category_id : {"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]}
         * sub_category_id : {"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":null,"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]}
         * consultant_id : {"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80}
         * note : null
         */

        private int id;
        private String means_of_communication;
        private String summary_problem;
        private Object rating;
        private String status;
        private SessionTimeBean session_time;
        private Object start_session;
        private Object end_session;
        private CategoryIdBean category_id;
        private SubCategoryIdBean sub_category_id;
        private ConsultantIdBean consultant_id;
        private Object note;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMeans_of_communication() {
            return means_of_communication;
        }

        public void setMeans_of_communication(String means_of_communication) {
            this.means_of_communication = means_of_communication;
        }

        public String getSummary_problem() {
            return summary_problem;
        }

        public void setSummary_problem(String summary_problem) {
            this.summary_problem = summary_problem;
        }

        public Object getRating() {
            return rating;
        }

        public void setRating(Object rating) {
            this.rating = rating;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public SessionTimeBean getSession_time() {
            return session_time;
        }

        public void setSession_time(SessionTimeBean session_time) {
            this.session_time = session_time;
        }

        public Object getStart_session() {
            return start_session;
        }

        public void setStart_session(Object start_session) {
            this.start_session = start_session;
        }

        public Object getEnd_session() {
            return end_session;
        }

        public void setEnd_session(Object end_session) {
            this.end_session = end_session;
        }

        public CategoryIdBean getCategory_id() {
            return category_id;
        }

        public void setCategory_id(CategoryIdBean category_id) {
            this.category_id = category_id;
        }

        public SubCategoryIdBean getSub_category_id() {
            return sub_category_id;
        }

        public void setSub_category_id(SubCategoryIdBean sub_category_id) {
            this.sub_category_id = sub_category_id;
        }

        public ConsultantIdBean getConsultant_id() {
            return consultant_id;
        }

        public void setConsultant_id(ConsultantIdBean consultant_id) {
            this.consultant_id = consultant_id;
        }

        public Object getNote() {
            return note;
        }

        public void setNote(Object note) {
            this.note = note;
        }

        public static class SessionTimeBean {
            /**
             * id : 1
             * time : 30
             * price : 50.00
             * created_at : 2019-09-18 19:05:17
             * updated_at : 2019-09-18 19:05:17
             * deleted_at : null
             */

            private int id;
            private String time;
            private String price;
            private String created_at;
            private String updated_at;
            private Object deleted_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public Object getDeleted_at() {
                return deleted_at;
            }

            public void setDeleted_at(Object deleted_at) {
                this.deleted_at = deleted_at;
            }
        }

        public static class CategoryIdBean {
            /**
             * id : 1
             * name_ar : طالب
             * name_en : Student
             * image : http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG
             * sup_category : [{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}]
             * consultant : [{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]
             */

            private int id;
            private String name_ar;
            private String name_en;
            private String image;
            private List<SupCategoryBeanX> sup_category;
            private List<ConsultantBeanX> consultant;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName_ar() {
                return name_ar;
            }

            public void setName_ar(String name_ar) {
                this.name_ar = name_ar;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public List<SupCategoryBeanX> getSup_category() {
                return sup_category;
            }

            public void setSup_category(List<SupCategoryBeanX> sup_category) {
                this.sup_category = sup_category;
            }

            public List<ConsultantBeanX> getConsultant() {
                return consultant;
            }

            public void setConsultant(List<ConsultantBeanX> consultant) {
                this.consultant = consultant;
            }

            public static class SupCategoryBeanX {
                /**
                 * id : 1
                 * name_ar : طالب
                 * name_en : Student
                 * image : http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG
                 * category : {"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}
                 * consultant : [{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]
                 */

                private int id;
                private String name_ar;
                private String name_en;
                private String image;
                private CategoryBean category;
                private List<ConsultantBean> consultant;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName_ar() {
                    return name_ar;
                }

                public void setName_ar(String name_ar) {
                    this.name_ar = name_ar;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public CategoryBean getCategory() {
                    return category;
                }

                public void setCategory(CategoryBean category) {
                    this.category = category;
                }

                public List<ConsultantBean> getConsultant() {
                    return consultant;
                }

                public void setConsultant(List<ConsultantBean> consultant) {
                    this.consultant = consultant;
                }

                public static class CategoryBean {
                    /**
                     * id : 1
                     * name_en : Student
                     * name_ar : طالب
                     * image :
                     * created_at : 2019-08-27 01:22:49
                     * updated_at : 2019-08-27 01:22:49
                     * deleted_at : null
                     */

                    private int id;
                    private String name_en;
                    private String name_ar;
                    private String image;
                    private String created_at;
                    private String updated_at;
                    private Object deleted_at;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName_en() {
                        return name_en;
                    }

                    public void setName_en(String name_en) {
                        this.name_en = name_en;
                    }

                    public String getName_ar() {
                        return name_ar;
                    }

                    public void setName_ar(String name_ar) {
                        this.name_ar = name_ar;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public Object getDeleted_at() {
                        return deleted_at;
                    }

                    public void setDeleted_at(Object deleted_at) {
                        this.deleted_at = deleted_at;
                    }
                }

                public static class ConsultantBean {
                    /**
                     * id : 2
                     * name : mahmoud zo
                     * email : ashq.smile@gmail.com
                     * phone : 0595592136
                     * gender : null
                     * nationality : null
                     * age : null
                     * date_of_birth : null
                     * degree : null
                     * current_job : null
                     * work_status : null
                     * social_status : null
                     * country_of_residence : null
                     * city_of_residence : null
                     * educational_status : null
                     * biography : null
                     * means_of_communication : null
                     * account_status : null
                     * photo : http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg
                     * languages : []
                     * category : [{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}]
                     * sup_category : [{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}]
                     * status : الحساب غير مفعل
                     * rating : 0
                     */

                    private int id;
                    private String name;
                    private String email;
                    private String phone;
                    private Object gender;
                    private Object nationality;
                    private Object age;
                    private Object date_of_birth;
                    private Object degree;
                    private Object current_job;
                    private Object work_status;
                    private Object social_status;
                    private Object country_of_residence;
                    private Object city_of_residence;
                    private Object educational_status;
                    private Object biography;
                    private Object means_of_communication;
                    private Object account_status;
                    private String photo;
                    private String status;
                    private int rating;
                    private List<?> languages;
                    private List<CategoryBeanX> category;
                    private List<SupCategoryBean> sup_category;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getEmail() {
                        return email;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public String getPhone() {
                        return phone;
                    }

                    public void setPhone(String phone) {
                        this.phone = phone;
                    }

                    public Object getGender() {
                        return gender;
                    }

                    public void setGender(Object gender) {
                        this.gender = gender;
                    }

                    public Object getNationality() {
                        return nationality;
                    }

                    public void setNationality(Object nationality) {
                        this.nationality = nationality;
                    }

                    public Object getAge() {
                        return age;
                    }

                    public void setAge(Object age) {
                        this.age = age;
                    }

                    public Object getDate_of_birth() {
                        return date_of_birth;
                    }

                    public void setDate_of_birth(Object date_of_birth) {
                        this.date_of_birth = date_of_birth;
                    }

                    public Object getDegree() {
                        return degree;
                    }

                    public void setDegree(Object degree) {
                        this.degree = degree;
                    }

                    public Object getCurrent_job() {
                        return current_job;
                    }

                    public void setCurrent_job(Object current_job) {
                        this.current_job = current_job;
                    }

                    public Object getWork_status() {
                        return work_status;
                    }

                    public void setWork_status(Object work_status) {
                        this.work_status = work_status;
                    }

                    public Object getSocial_status() {
                        return social_status;
                    }

                    public void setSocial_status(Object social_status) {
                        this.social_status = social_status;
                    }

                    public Object getCountry_of_residence() {
                        return country_of_residence;
                    }

                    public void setCountry_of_residence(Object country_of_residence) {
                        this.country_of_residence = country_of_residence;
                    }

                    public Object getCity_of_residence() {
                        return city_of_residence;
                    }

                    public void setCity_of_residence(Object city_of_residence) {
                        this.city_of_residence = city_of_residence;
                    }

                    public Object getEducational_status() {
                        return educational_status;
                    }

                    public void setEducational_status(Object educational_status) {
                        this.educational_status = educational_status;
                    }

                    public Object getBiography() {
                        return biography;
                    }

                    public void setBiography(Object biography) {
                        this.biography = biography;
                    }

                    public Object getMeans_of_communication() {
                        return means_of_communication;
                    }

                    public void setMeans_of_communication(Object means_of_communication) {
                        this.means_of_communication = means_of_communication;
                    }

                    public Object getAccount_status() {
                        return account_status;
                    }

                    public void setAccount_status(Object account_status) {
                        this.account_status = account_status;
                    }

                    public String getPhoto() {
                        return photo;
                    }

                    public void setPhoto(String photo) {
                        this.photo = photo;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public int getRating() {
                        return rating;
                    }

                    public void setRating(int rating) {
                        this.rating = rating;
                    }

                    public List<?> getLanguages() {
                        return languages;
                    }

                    public void setLanguages(List<?> languages) {
                        this.languages = languages;
                    }

                    public List<CategoryBeanX> getCategory() {
                        return category;
                    }

                    public void setCategory(List<CategoryBeanX> category) {
                        this.category = category;
                    }

                    public List<SupCategoryBean> getSup_category() {
                        return sup_category;
                    }

                    public void setSup_category(List<SupCategoryBean> sup_category) {
                        this.sup_category = sup_category;
                    }

                    public static class CategoryBeanX {
                        /**
                         * id : 2
                         * name_en : dd
                         * name_ar : يي
                         * image :
                         * created_at : 2019-08-30 01:30:13
                         * updated_at : 2019-08-30 01:30:13
                         * deleted_at : null
                         */

                        private int id;
                        private String name_en;
                        private String name_ar;
                        private String image;
                        private String created_at;
                        private String updated_at;
                        private Object deleted_at;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName_en() {
                            return name_en;
                        }

                        public void setName_en(String name_en) {
                            this.name_en = name_en;
                        }

                        public String getName_ar() {
                            return name_ar;
                        }

                        public void setName_ar(String name_ar) {
                            this.name_ar = name_ar;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }

                        public String getCreated_at() {
                            return created_at;
                        }

                        public void setCreated_at(String created_at) {
                            this.created_at = created_at;
                        }

                        public String getUpdated_at() {
                            return updated_at;
                        }

                        public void setUpdated_at(String updated_at) {
                            this.updated_at = updated_at;
                        }

                        public Object getDeleted_at() {
                            return deleted_at;
                        }

                        public void setDeleted_at(Object deleted_at) {
                            this.deleted_at = deleted_at;
                        }
                    }

                    public static class SupCategoryBean {
                        /**
                         * id : 1
                         * name_ar : طالب
                         * name_en : Student
                         * image :
                         * created_at : 2019-09-18 18:29:40
                         * updated_at : 2019-09-18 18:29:40
                         * deleted_at : null
                         * categoey_id : 1
                         */

                        private int id;
                        private String name_ar;
                        private String name_en;
                        private String image;
                        private String created_at;
                        private String updated_at;
                        private Object deleted_at;
                        private String categoey_id;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName_ar() {
                            return name_ar;
                        }

                        public void setName_ar(String name_ar) {
                            this.name_ar = name_ar;
                        }

                        public String getName_en() {
                            return name_en;
                        }

                        public void setName_en(String name_en) {
                            this.name_en = name_en;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }

                        public String getCreated_at() {
                            return created_at;
                        }

                        public void setCreated_at(String created_at) {
                            this.created_at = created_at;
                        }

                        public String getUpdated_at() {
                            return updated_at;
                        }

                        public void setUpdated_at(String updated_at) {
                            this.updated_at = updated_at;
                        }

                        public Object getDeleted_at() {
                            return deleted_at;
                        }

                        public void setDeleted_at(Object deleted_at) {
                            this.deleted_at = deleted_at;
                        }

                        public String getCategoey_id() {
                            return categoey_id;
                        }

                        public void setCategoey_id(String categoey_id) {
                            this.categoey_id = categoey_id;
                        }
                    }
                }
            }

            public static class ConsultantBeanX {
                /**
                 * id : 1
                 * name : test
                 * email : ashq.44@gmail.com
                 * phone : 2139902320
                 * gender : test
                 * nationality : null
                 * age : null
                 * date_of_birth : null
                 * degree : null
                 * current_job : null
                 * work_status : null
                 * social_status : null
                 * country_of_residence : null
                 * city_of_residence : null
                 * educational_status : null
                 * biography : null
                 * means_of_communication : null
                 * account_status : 1
                 * photo : http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg
                 * languages : [{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}]
                 * category : [{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}]
                 * sup_category : []
                 * status : الحساب  مفعل
                 * rating : 80
                 */

                private int id;
                private String name;
                private String email;
                private String phone;
                private String gender;
                private Object nationality;
                private Object age;
                private Object date_of_birth;
                private Object degree;
                private Object current_job;
                private Object work_status;
                private Object social_status;
                private Object country_of_residence;
                private Object city_of_residence;
                private Object educational_status;
                private Object biography;
                private Object means_of_communication;
                private String account_status;
                private String photo;
                private String status;
                private int rating;
                private List<LanguagesBean> languages;
                private List<CategoryBeanXX> category;
                private List<?> sup_category;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getGender() {
                    return gender;
                }

                public void setGender(String gender) {
                    this.gender = gender;
                }

                public Object getNationality() {
                    return nationality;
                }

                public void setNationality(Object nationality) {
                    this.nationality = nationality;
                }

                public Object getAge() {
                    return age;
                }

                public void setAge(Object age) {
                    this.age = age;
                }

                public Object getDate_of_birth() {
                    return date_of_birth;
                }

                public void setDate_of_birth(Object date_of_birth) {
                    this.date_of_birth = date_of_birth;
                }

                public Object getDegree() {
                    return degree;
                }

                public void setDegree(Object degree) {
                    this.degree = degree;
                }

                public Object getCurrent_job() {
                    return current_job;
                }

                public void setCurrent_job(Object current_job) {
                    this.current_job = current_job;
                }

                public Object getWork_status() {
                    return work_status;
                }

                public void setWork_status(Object work_status) {
                    this.work_status = work_status;
                }

                public Object getSocial_status() {
                    return social_status;
                }

                public void setSocial_status(Object social_status) {
                    this.social_status = social_status;
                }

                public Object getCountry_of_residence() {
                    return country_of_residence;
                }

                public void setCountry_of_residence(Object country_of_residence) {
                    this.country_of_residence = country_of_residence;
                }

                public Object getCity_of_residence() {
                    return city_of_residence;
                }

                public void setCity_of_residence(Object city_of_residence) {
                    this.city_of_residence = city_of_residence;
                }

                public Object getEducational_status() {
                    return educational_status;
                }

                public void setEducational_status(Object educational_status) {
                    this.educational_status = educational_status;
                }

                public Object getBiography() {
                    return biography;
                }

                public void setBiography(Object biography) {
                    this.biography = biography;
                }

                public Object getMeans_of_communication() {
                    return means_of_communication;
                }

                public void setMeans_of_communication(Object means_of_communication) {
                    this.means_of_communication = means_of_communication;
                }

                public String getAccount_status() {
                    return account_status;
                }

                public void setAccount_status(String account_status) {
                    this.account_status = account_status;
                }

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getRating() {
                    return rating;
                }

                public void setRating(int rating) {
                    this.rating = rating;
                }

                public List<LanguagesBean> getLanguages() {
                    return languages;
                }

                public void setLanguages(List<LanguagesBean> languages) {
                    this.languages = languages;
                }

                public List<CategoryBeanXX> getCategory() {
                    return category;
                }

                public void setCategory(List<CategoryBeanXX> category) {
                    this.category = category;
                }

                public List<?> getSup_category() {
                    return sup_category;
                }

                public void setSup_category(List<?> sup_category) {
                    this.sup_category = sup_category;
                }

                public static class LanguagesBean {
                    /**
                     * id : 1
                     * name_ar : انجليزي
                     * name_en : Einglish
                     */

                    private int id;
                    private String name_ar;
                    private String name_en;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName_ar() {
                        return name_ar;
                    }

                    public void setName_ar(String name_ar) {
                        this.name_ar = name_ar;
                    }

                    public String getName_en() {
                        return name_en;
                    }

                    public void setName_en(String name_en) {
                        this.name_en = name_en;
                    }
                }

                public static class CategoryBeanXX {
                    /**
                     * id : 1
                     * name_en : Student
                     * name_ar : طالب
                     * image :
                     * created_at : 2019-08-27 01:22:49
                     * updated_at : 2019-08-27 01:22:49
                     * deleted_at : null
                     */

                    private int id;
                    private String name_en;
                    private String name_ar;
                    private String image;
                    private String created_at;
                    private String updated_at;
                    private Object deleted_at;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName_en() {
                        return name_en;
                    }

                    public void setName_en(String name_en) {
                        this.name_en = name_en;
                    }

                    public String getName_ar() {
                        return name_ar;
                    }

                    public void setName_ar(String name_ar) {
                        this.name_ar = name_ar;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public Object getDeleted_at() {
                        return deleted_at;
                    }

                    public void setDeleted_at(Object deleted_at) {
                        this.deleted_at = deleted_at;
                    }
                }
            }
        }

        public static class SubCategoryIdBean {
            /**
             * id : 1
             * name_ar : طالب
             * name_en : Student
             * image : http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG
             * category : null
             * consultant : [{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]
             */

            private int id;
            private String name_ar;
            private String name_en;
            private String image;
            private Object category;
            private List<ConsultantBeanXX> consultant;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName_ar() {
                return name_ar;
            }

            public void setName_ar(String name_ar) {
                this.name_ar = name_ar;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public Object getCategory() {
                return category;
            }

            public void setCategory(Object category) {
                this.category = category;
            }

            public List<ConsultantBeanXX> getConsultant() {
                return consultant;
            }

            public void setConsultant(List<ConsultantBeanXX> consultant) {
                this.consultant = consultant;
            }

            public static class ConsultantBeanXX {
                /**
                 * id : 1
                 * name : test
                 * email : ashq.44@gmail.com
                 * phone : 2139902320
                 * gender : test
                 * nationality : null
                 * age : null
                 * date_of_birth : null
                 * degree : null
                 * current_job : null
                 * work_status : null
                 * social_status : null
                 * country_of_residence : null
                 * city_of_residence : null
                 * educational_status : null
                 * biography : null
                 * means_of_communication : null
                 * account_status : 1
                 * photo : http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg
                 * languages : [{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}]
                 * category : [{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}]
                 * sup_category : []
                 * status : الحساب  مفعل
                 * rating : 80
                 */

                private int id;
                private String name;
                private String email;
                private String phone;
                private String gender;
                private Object nationality;
                private Object age;
                private Object date_of_birth;
                private Object degree;
                private Object current_job;
                private Object work_status;
                private Object social_status;
                private Object country_of_residence;
                private Object city_of_residence;
                private Object educational_status;
                private Object biography;
                private Object means_of_communication;
                private String account_status;
                private String photo;
                private String status;
                private int rating;
                private List<LanguagesBeanX> languages;
                private List<CategoryBeanXXX> category;
                private List<?> sup_category;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getGender() {
                    return gender;
                }

                public void setGender(String gender) {
                    this.gender = gender;
                }

                public Object getNationality() {
                    return nationality;
                }

                public void setNationality(Object nationality) {
                    this.nationality = nationality;
                }

                public Object getAge() {
                    return age;
                }

                public void setAge(Object age) {
                    this.age = age;
                }

                public Object getDate_of_birth() {
                    return date_of_birth;
                }

                public void setDate_of_birth(Object date_of_birth) {
                    this.date_of_birth = date_of_birth;
                }

                public Object getDegree() {
                    return degree;
                }

                public void setDegree(Object degree) {
                    this.degree = degree;
                }

                public Object getCurrent_job() {
                    return current_job;
                }

                public void setCurrent_job(Object current_job) {
                    this.current_job = current_job;
                }

                public Object getWork_status() {
                    return work_status;
                }

                public void setWork_status(Object work_status) {
                    this.work_status = work_status;
                }

                public Object getSocial_status() {
                    return social_status;
                }

                public void setSocial_status(Object social_status) {
                    this.social_status = social_status;
                }

                public Object getCountry_of_residence() {
                    return country_of_residence;
                }

                public void setCountry_of_residence(Object country_of_residence) {
                    this.country_of_residence = country_of_residence;
                }

                public Object getCity_of_residence() {
                    return city_of_residence;
                }

                public void setCity_of_residence(Object city_of_residence) {
                    this.city_of_residence = city_of_residence;
                }

                public Object getEducational_status() {
                    return educational_status;
                }

                public void setEducational_status(Object educational_status) {
                    this.educational_status = educational_status;
                }

                public Object getBiography() {
                    return biography;
                }

                public void setBiography(Object biography) {
                    this.biography = biography;
                }

                public Object getMeans_of_communication() {
                    return means_of_communication;
                }

                public void setMeans_of_communication(Object means_of_communication) {
                    this.means_of_communication = means_of_communication;
                }

                public String getAccount_status() {
                    return account_status;
                }

                public void setAccount_status(String account_status) {
                    this.account_status = account_status;
                }

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getRating() {
                    return rating;
                }

                public void setRating(int rating) {
                    this.rating = rating;
                }

                public List<LanguagesBeanX> getLanguages() {
                    return languages;
                }

                public void setLanguages(List<LanguagesBeanX> languages) {
                    this.languages = languages;
                }

                public List<CategoryBeanXXX> getCategory() {
                    return category;
                }

                public void setCategory(List<CategoryBeanXXX> category) {
                    this.category = category;
                }

                public List<?> getSup_category() {
                    return sup_category;
                }

                public void setSup_category(List<?> sup_category) {
                    this.sup_category = sup_category;
                }

                public static class LanguagesBeanX {
                    /**
                     * id : 1
                     * name_ar : انجليزي
                     * name_en : Einglish
                     */

                    private int id;
                    private String name_ar;
                    private String name_en;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName_ar() {
                        return name_ar;
                    }

                    public void setName_ar(String name_ar) {
                        this.name_ar = name_ar;
                    }

                    public String getName_en() {
                        return name_en;
                    }

                    public void setName_en(String name_en) {
                        this.name_en = name_en;
                    }
                }

                public static class CategoryBeanXXX {
                    /**
                     * id : 1
                     * name_en : Student
                     * name_ar : طالب
                     * image :
                     * created_at : 2019-08-27 01:22:49
                     * updated_at : 2019-08-27 01:22:49
                     * deleted_at : null
                     */

                    private int id;
                    private String name_en;
                    private String name_ar;
                    private String image;
                    private String created_at;
                    private String updated_at;
                    private Object deleted_at;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName_en() {
                        return name_en;
                    }

                    public void setName_en(String name_en) {
                        this.name_en = name_en;
                    }

                    public String getName_ar() {
                        return name_ar;
                    }

                    public void setName_ar(String name_ar) {
                        this.name_ar = name_ar;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public Object getDeleted_at() {
                        return deleted_at;
                    }

                    public void setDeleted_at(Object deleted_at) {
                        this.deleted_at = deleted_at;
                    }
                }
            }
        }

        public static class ConsultantIdBean {
            /**
             * id : 1
             * name : test
             * email : ashq.44@gmail.com
             * phone : 2139902320
             * gender : test
             * nationality : null
             * age : null
             * date_of_birth : null
             * degree : null
             * current_job : null
             * work_status : null
             * social_status : null
             * country_of_residence : null
             * city_of_residence : null
             * educational_status : null
             * biography : null
             * means_of_communication : null
             * account_status : 1
             * photo : http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg
             * languages : [{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}]
             * category : [{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}]
             * sup_category : []
             * status : الحساب  مفعل
             * rating : 80
             */

            private int id;
            private String name;
            private String email;
            private String phone;
            private String gender;
            private Object nationality;
            private Object age;
            private Object date_of_birth;
            private Object degree;
            private Object current_job;
            private Object work_status;
            private Object social_status;
            private Object country_of_residence;
            private Object city_of_residence;
            private Object educational_status;
            private Object biography;
            private Object means_of_communication;
            private String account_status;
            private String photo;
            private String status;
            private int rating;
            private List<LanguagesBeanXX> languages;
            private List<CategoryBeanXXXX> category;
            private List<?> sup_category;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public Object getNationality() {
                return nationality;
            }

            public void setNationality(Object nationality) {
                this.nationality = nationality;
            }

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public Object getDate_of_birth() {
                return date_of_birth;
            }

            public void setDate_of_birth(Object date_of_birth) {
                this.date_of_birth = date_of_birth;
            }

            public Object getDegree() {
                return degree;
            }

            public void setDegree(Object degree) {
                this.degree = degree;
            }

            public Object getCurrent_job() {
                return current_job;
            }

            public void setCurrent_job(Object current_job) {
                this.current_job = current_job;
            }

            public Object getWork_status() {
                return work_status;
            }

            public void setWork_status(Object work_status) {
                this.work_status = work_status;
            }

            public Object getSocial_status() {
                return social_status;
            }

            public void setSocial_status(Object social_status) {
                this.social_status = social_status;
            }

            public Object getCountry_of_residence() {
                return country_of_residence;
            }

            public void setCountry_of_residence(Object country_of_residence) {
                this.country_of_residence = country_of_residence;
            }

            public Object getCity_of_residence() {
                return city_of_residence;
            }

            public void setCity_of_residence(Object city_of_residence) {
                this.city_of_residence = city_of_residence;
            }

            public Object getEducational_status() {
                return educational_status;
            }

            public void setEducational_status(Object educational_status) {
                this.educational_status = educational_status;
            }

            public Object getBiography() {
                return biography;
            }

            public void setBiography(Object biography) {
                this.biography = biography;
            }

            public Object getMeans_of_communication() {
                return means_of_communication;
            }

            public void setMeans_of_communication(Object means_of_communication) {
                this.means_of_communication = means_of_communication;
            }

            public String getAccount_status() {
                return account_status;
            }

            public void setAccount_status(String account_status) {
                this.account_status = account_status;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public List<LanguagesBeanXX> getLanguages() {
                return languages;
            }

            public void setLanguages(List<LanguagesBeanXX> languages) {
                this.languages = languages;
            }

            public List<CategoryBeanXXXX> getCategory() {
                return category;
            }

            public void setCategory(List<CategoryBeanXXXX> category) {
                this.category = category;
            }

            public List<?> getSup_category() {
                return sup_category;
            }

            public void setSup_category(List<?> sup_category) {
                this.sup_category = sup_category;
            }

            public static class LanguagesBeanXX {
                /**
                 * id : 1
                 * name_ar : انجليزي
                 * name_en : Einglish
                 */

                private int id;
                private String name_ar;
                private String name_en;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName_ar() {
                    return name_ar;
                }

                public void setName_ar(String name_ar) {
                    this.name_ar = name_ar;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }
            }

            public static class CategoryBeanXXXX {
                /**
                 * id : 1
                 * name_en : Student
                 * name_ar : طالب
                 * image :
                 * created_at : 2019-08-27 01:22:49
                 * updated_at : 2019-08-27 01:22:49
                 * deleted_at : null
                 */

                private int id;
                private String name_en;
                private String name_ar;
                private String image;
                private String created_at;
                private String updated_at;
                private Object deleted_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getName_ar() {
                    return name_ar;
                }

                public void setName_ar(String name_ar) {
                    this.name_ar = name_ar;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public Object getDeleted_at() {
                    return deleted_at;
                }

                public void setDeleted_at(Object deleted_at) {
                    this.deleted_at = deleted_at;
                }
            }
        }
    }
}