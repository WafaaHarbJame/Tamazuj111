package com.Tamazj.TamazjApp.Model;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by a_man on 5/5/2017.
 */

public class Helper {
    public static final String BROADCAST_USER = "com.verbosetech.yoohoo.services.USER";
    public static final String BROADCAST_MY_CONTACTS = "com.verbosetech.yoohoo.MY_CONTACTS";
    public static final String BROADCAST_MY_USERS = "com.verbosetech.yoohoo.MY_USERS";
    public static final String BROADCAST_DOWNLOAD_EVENT = "com.verbosetech.yoohoo.DOWNLOAD_EVENT";
    public static final String BROADCAST_GROUP = "com.verbosetech.yoohoo.services.GROUP";
    public static final String BROADCAST_LOGOUT = "com.verbosetech.yoohoo.services.LOGOUT";
    public static final String UPLOAD_AND_SEND = "com.verbosetech.yoohoo.services.UPLOAD_N_SEND";
    public static final String FETCH_MY_USERS = "com.verbosetech.yoohoo.services.FETCH_MY_USERS";
    public static final String GROUP_CREATE = "group_create";
    public static final String GROUP_PREFIX = "group";
    public static final String USER_NAME_CACHE = "usercachemap";
    public static final String REF_CHAT = "chats";
    public static final String REF_GROUP = "groups";
    public static final String REF_INBOX = "inbox";
    public static final String REF_USERS = "users";
    public static final String REF_USERS_FCM_IDS = "user_fcm_ids";
    public static final String REF_NEW_USER = "new_user";
    private static final String USER = "USER";
    private static final String USER_MUTE = "USER_MUTE";
    private static final String SEND_OTP = "SEND_OTP";
    public static String CURRENT_CHAT_ID;
    public static boolean CHAT_CAB = false;

    private Gson gson;
    private HashSet<String> muteUsersSet;
    private HashMap<String, User> myUsersNameInPhoneMap;


    public static String getDateTime(Long milliseconds) {
        return new SimpleDateFormat("dd MMM kk:mm", Locale.getDefault()).format(new Date(milliseconds));
    }

    public static String getTime(Long milliseconds) {
        return new SimpleDateFormat("kk:mm", Locale.getDefault()).format(new Date(milliseconds));
    }

    public static boolean isImage(Context context, String url) {
        return getMimeType(context, url).startsWith("image");
    }

    public static String getMimeType(Context context, Uri uri) {
        String mimeType = null;
        if (uri.getScheme().equals(ContentResolver.SCHEME_CONTENT)) {
            ContentResolver cr = context.getContentResolver();
            mimeType = cr.getType(uri);
        } else {
            String fileExtension = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.toLowerCase());
        }
        return mimeType;
    }

    public static String getMimeType(Context context, String url) {
        String mimeType;
        Uri uri = Uri.parse(url);
        if (uri.getScheme().equals(ContentResolver.SCHEME_CONTENT)) {
            ContentResolver cr = context.getContentResolver();
            mimeType = cr.getType(uri);
        } else {
            String fileExtension = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.toLowerCase());
        }
        return mimeType;
    }

    public static String getChatChild(String userId, String myId) {
        //example: userId="9" and myId="5" -->> chat child = "5-9"
        String[] temp = {userId, myId};
        Arrays.sort(temp);
        return temp[0] + "-" + temp[1];
    }

    public Helper(Context context) {
        //sharedPreferenceHelper = new SharedPreferenceHelper(context);
        gson = new Gson();
    }

    public static Realm getRealmInstance() {
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm realm = Realm.getInstance(config);
        return realm;
    }

}