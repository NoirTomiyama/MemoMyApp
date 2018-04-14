package com.lifeistech.android.mymemoapp;


import android.content.Context;
import android.content.SharedPreferences;

public class SettingPrefUtil {

    // 保存先ファイル名
    public static final String PREF_FILE_NAME = "setting";

    // ファイル名プレフィックスのKEY
    private static final String KEY_FILE_NAME_PREFIX = "file.name.prefix";
    // 未設定時のデフォルト値
    private static final String KEY_FILE_NAME_PREFIX_DEFAULT = "memo";

    // 文字サイズ，文字装飾，画面の明暗反転

    private static final String KEY_TEXT_SIZE = "text.size";
    public static final String TEXT_SIZE_LARGE = "large";
    public static final String TEXT_SIZE_MEDIUM = "medium";
    public static final String TEXT_SIZE_SMALL = "small";

    private static final String KEY_TEXT_STYLE = "text.style";
    public static final String TEXT_STYLE_BOLD = "bold";
    public static final String TEXT_STYLE_ITALIC = "italic";

    private static final String KEY_SCREEN_REVERSE = "screen.reverse";


    // ファイル名プレフィックスの値を取得する
    public static String getFileNamePrefix(Context context){
        //SharedPreferencesを取得
        SharedPreferences sp = context.getSharedPreferences(
                PREF_FILE_NAME,Context.MODE_PRIVATE);

        //SharedPreferencesから設定値を取得する
        return sp.getString(KEY_FILE_NAME_PREFIX,KEY_FILE_NAME_PREFIX_DEFAULT);
    }
}
