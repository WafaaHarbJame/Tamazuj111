package com.Tamazj.TamazjApp.Model;

import java.util.List;

public class HomeModel {

    /**
     * bestRating : [{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0}]
     * category : [{"id":2,"name_ar":"يي","name_en":"dd","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":3,"name":"mahmoud zo","email":"ashq.smile2@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]},{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG","category":{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},"consultant":[{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0}]}],"consultant":[{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]}]
     * bestConsultant : [{"id":9,"name":"mahmoud zo","email":"ashq.smile3@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0}]
     * message : تم العرض بنجاح
     * status : 1
     */

    private String message;
    private int status;
    private List<BestRatingBean> bestRating;
    private List<CategoryBeanXX> category;
    private List<BestConsultantBean> bestConsultant;

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

    public List<BestRatingBean> getBestRating() {
        return bestRating;
    }

    public void setBestRating(List<BestRatingBean> bestRating) {
        this.bestRating = bestRating;
    }

    public List<CategoryBeanXX> getCategory() {
        return category;
    }

    public void setCategory(List<CategoryBeanXX> category) {
        this.category = category;
    }

    public List<BestConsultantBean> getBestConsultant() {
        return bestConsultant;
    }

    public void setBestConsultant(List<BestConsultantBean> bestConsultant) {
        this.bestConsultant = bestConsultant;
    }

    public static class BestRatingBean {
        /**
         * id : 9
         * name : mahmoud zo
         * email : ashq.smile3@gmail.com
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
         * category : [{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}]
         * sup_category : []
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
        private List<CategoryBean> category;
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

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public List<?> getSup_category() {
            return sup_category;
        }

        public void setSup_category(List<?> sup_category) {
            this.sup_category = sup_category;
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
    }

    public static class CategoryBeanXX {
        /**
         * id : 2
         * name_ar : يي
         * name_en : dd
         * image : http://salahalimohamed.website/tmajog/public/admin/img/setting/12.PNG
         * sup_category : []
         * consultant : [{"id":1,"name":"test","email":"ashq.44@gmail.com","phone":"2139902320","gender":"test","nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[{"id":1,"name_ar":"انجليزي","name_en":"Einglish"},{"id":2,"name_ar":"عربي","name_en":"Arabic"}],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":80},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":2,"name":"mahmoud zo","email":"ashq.smile@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"},{"id":1,"name_ar":"طالب","name_en":"Student","image":"","created_at":"2019-09-18 18:29:40","updated_at":"2019-09-18 18:29:40","deleted_at":null,"categoey_id":"1"}],"status":"الحساب غير مفعل","rating":0},{"id":3,"name":"mahmoud zo","email":"ashq.smile2@gmail.com","phone":"0595592136","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":null,"photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب غير مفعل","rating":0},{"id":10,"name":"Mark V. Hatcher","email":"admin@admin.com","phone":"2139902320","gender":null,"nationality":null,"age":null,"date_of_birth":null,"degree":null,"current_job":null,"work_status":null,"social_status":null,"country_of_residence":null,"city_of_residence":null,"educational_status":null,"biography":null,"means_of_communication":null,"account_status":"1","photo":"http://salahalimohamed.website/tmajog/public/admin/img/setting/35163665790_d182d84f5e_k.jpg","languages":[],"category":[{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null},{"id":2,"name_en":"dd","name_ar":"يي","image":"","created_at":"2019-08-30 01:30:13","updated_at":"2019-08-30 01:30:13","deleted_at":null}],"sup_category":[],"status":"الحساب  مفعل ","rating":0}]
         */

        private int id;
        private String name_ar;
        private String name_en;
        private String image;
        private List<?> sup_category;
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

        public List<?> getSup_category() {
            return sup_category;
        }

        public void setSup_category(List<?> sup_category) {
            this.sup_category = sup_category;
        }

        public List<ConsultantBean> getConsultant() {
            return consultant;
        }

        public void setConsultant(List<ConsultantBean> consultant) {
            this.consultant = consultant;
        }

        public static class ConsultantBean {
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
            private List<CategoryBeanX> category;
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

            public List<CategoryBeanX> getCategory() {
                return category;
            }

            public void setCategory(List<CategoryBeanX> category) {
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

            public static class CategoryBeanX {
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

    public static class BestConsultantBean {
        /**
         * id : 9
         * name : mahmoud zo
         * email : ashq.smile3@gmail.com
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
         * category : [{"id":1,"name_en":"Student","name_ar":"طالب","image":"","created_at":"2019-08-27 01:22:49","updated_at":"2019-08-27 01:22:49","deleted_at":null}]
         * sup_category : []
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
