package com.B58works;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.v7.app.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.MentionableEntry;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.data.ey;
import com.whatsapp.protocol.j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by Bharath.R(58) on 16-11-2017.
 */

public class B58 {
    public static String B58;
    public static Activity B58Activity;
    public static boolean IsB58;
    public static int a;
    public static int conversation_contact_photo_frame;
    public static Context ctx;
    protected static final char[] hexArray;
    static Class n;
    public static int sid;
    public static SQLiteOpenHelper sql;

    static {
        hexArray = "0123456789ABCDEF".toCharArray();
        com.B58works.B58.IsB58 = false;
        com.B58works.B58.n = B58.class;
        com.B58works.B58.sid = 2131755399;
        com.B58works.B58.a = 2131755231;
        com.B58works.B58.conversation_contact_photo_frame = 2131756585;
    }

    public static boolean AntiRevoke(final Object o) {
        return true;
    }

    public static boolean B58HideCR(final int n) {
        return n == 0 || true;
    }

    public static boolean B58HidePlay(final Object o) {
        return true;
    }

    public static boolean B58HideRead(final Object o) {
        return true;
    }

    public static boolean B58HideReceipt(final Object o) {
        return getBoolean("HideReceipt");
    }

    public static boolean B58HideStatus() {
        return true ^ true;
    }

    public static void ChangeSize(final TextView textView, final int n) {
        if (textView != null) {
            textView.setTextSize((float)(com.B58works.B58.ctx.getSharedPreferences("com.whatsapp_preferences", 0).getInt("main_text", 15) - n));
            textView.setTextColor(mainTextColor());
        }
    }

    public static void ChatMsgColor(final TextView textView, final Context context, final j j) {
        try {
            String s = "left_message_text_color_check";
            if (j.b.b) {
                s = "right_message_text_color_check";
            }
            if (s.contains("right")) {
                textView.setTextColor(getColor("ModConTextColor", getActionBarColor()));
            }
            else {
                textView.setTextColor(getColor("ModConTextColor", getActionBarColor()));
            }
            textView.setTextSize((float)16);
        }
        catch (Exception ex) {}
    }

    public static void ClearLogs(final Context context) {
        DeleteDirectory(new File(context.getFilesDir() + "/Logs"));
        Toast.makeText(com.B58works.B58.ctx, (CharSequence)"WhatsApp Logs have been cleared successfully.", Toast.LENGTH_SHORT).show();
    }

    public static void DeleteDirectory(final File file) {
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; ++i) {
                DeleteDirectory(listFiles[i]);
            }
        }
        file.delete();
    }

    public static void HidePicBar(final Conversation conversation) {
        try {
            if (true) {
                conversation.findViewById(com.B58works.B58.conversation_contact_photo_frame).setVisibility(View.INVISIBLE);
            }
        }
        catch (Exception ex) {}
    }

    public static String MaMy_Name2() {
        return com.B58works.B58.ctx.getSharedPreferences("com.whatsapp_preferences", 0).getString("push_name", "");
    }

    public static int MainBKC() {
        int n;
        if (com.B58works.B58.ctx.getSharedPreferences("B58", 0).getBoolean("start_bl", false)) {
            n = Color.parseColor("#303030");
        }
        else {
            n = getColor("ModConBackColor", getConsBackColor());
        }
        return n;
    }

    public static a ModContPick(final a a) {
        final int color = getColor("ModConPickColor", -11);
        if (color != -11) {
            a.a((Drawable)new ColorDrawable(color));
        }
        return a;
    }

    static Intent OpenChat(final String s) {
        try {
            return Conversation.a(com.B58works.B58.ctx, s);
        }
        catch (Exception ex) {
            return null;
        }
    }

    private static void PrefSet() {
        SetPrefInt1("ModConPickColor", -13619152);
        SetPrefInt1("ModConBackColor", -13619152);
        SetPrefInt1("ModConTextColor", -329737);
        SetPrefInt1("ModConTextColor1", -986896);
        SetPrefInt("main_text", 14);
        SetPrefInt1("ModConPickColor", -13619152);
        SetPrefInt1("ModChatColor", -13619152);
        SetPrefInt1("ModContactNameColor", -3266841);
        SetPrefInt1("ModChatEntry", 65793);
        SetPrefBool("doc_detection_enabled", true);
        SetPrefBool("quick_reply_enabled", true);
        SetPrefBool("groups_v3", true);
        SetPrefBool("mozjpeg", true);
        SetPrefBool("search_in_storage_usage", true);
        SetPrefBool("restrict_groups", true);
    }

    public static void SetGroupChat(final boolean b) {
        SetPrefBool("is_group_chat", b);
    }

    private static void SetPrefBool(final String s, final boolean b) {
        final SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.B58works.B58.ctx).edit();
        edit.putBoolean(s, b);
        edit.apply();
    }

    private static void SetPrefBool1(final String s, final boolean b) {
        final SharedPreferences.Editor edit = com.B58works.B58.ctx.getSharedPreferences("B58", 0).edit();
        edit.putBoolean(s, b);
        edit.apply();
    }

    private static void SetPrefInt(final String s, final int n) {
        final SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.B58works.B58.ctx).edit();
        edit.putInt(s, n);
        edit.apply();
    }

    private static void SetPrefInt1(final String s, final int n) {
        final SharedPreferences.Editor edit = com.B58works.B58.ctx.getSharedPreferences("B58", 0).edit();
        edit.putInt(s, n);
        edit.apply();
    }

    public static void ShowName(final a a, final Context context) {
        a.a(MaMy_Name2());
    }

    public static void TxtSelect(final TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setTextIsSelectable(true);
    }

    @SuppressLint("RestrictedApi")
    static void a(final View view, final int textColor) {
        try {
            if (view instanceof ImageView) {
                ((ImageView)view).setColorFilter(textColor, PorterDuff.Mode.SRC_ATOP);
            }
            else {
                if (view instanceof TextView) {
                    ((TextView)view).setTextColor(textColor);
                }
                try {
                    final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)view;
                    final Drawable[] compoundDrawables = actionMenuItemView.getCompoundDrawables();
                    compoundDrawables[0].setColorFilter(textColor, PorterDuff.Mode.SRC_ATOP);
                    actionMenuItemView.setIcon(compoundDrawables[0]);
                }
                catch (ClassCastException ex2) {}
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void a(final String s) {
        ((ClipboardManager)getCtx().getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText((CharSequence)"text", (CharSequence)s));
        Toast.makeText(getCtx(), (CharSequence)"Status copied", Toast.LENGTH_SHORT).show();
    }

    public static void a(final String s, final View view) {
        a(s);
    }

    public static void actionbarbk(final Activity activity) {
        String s = "ModConPickColor";
        try {
            if (activity instanceof Conversation) {
                s = "ModChatColor";
            }
            final int color = getColor(s, -11);
            Object viewById = null;
            if (color != -11) {
                viewById = activity.findViewById(com.B58works.B58.a);
                ((View)viewById).setBackgroundDrawable((Drawable)new ColorDrawable(color));
            }
            final ViewGroup viewGroup = (ViewGroup)viewById;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                b(viewGroup.getChildAt(i), -329737);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void addMenu(final HomeActivity homeActivity, final MenuItem menuItem) {
        if (menuItem.getItemId() == getResID("B58mods", "id")) {
            homeActivity.startActivity(new Intent((Context)homeActivity, (Class)Settings.class));
        }
        if (menuItem.getItemId() == getResID("openc", "id")) {
            final AlertDialog.Builder alertDialog$Builder = new AlertDialog.Builder((Context)homeActivity);
            alertDialog$Builder.setTitle((CharSequence)"New Chat");
            alertDialog$Builder.setMessage((CharSequence)"Enter Number");
            final EditText view = new EditText((Context)homeActivity);
            view.setText((CharSequence)"91");
            alertDialog$Builder.setView((View)view);
            alertDialog$Builder.setPositiveButton((CharSequence)"Message!", (DialogInterface.OnClickListener)new DialogInterface.OnClickListener() {
                public void onClick(final DialogInterface dialogInterface, final int n) {
                    final String string = view.getText().toString() + "@s.whatsapp.net";
                    if (com.B58works.B58.OpenChat(string) == null) {
                        Toast.makeText((Context)homeActivity, (CharSequence)"This Number does not Exist On WhatsApp, Check Again!", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        homeActivity.startActivity(com.B58works.B58.OpenChat(string));
                    }
                }
            });
            alertDialog$Builder.setNegativeButton((CharSequence)"Cancel", (DialogInterface.OnClickListener)new DialogInterface.OnClickListener() {
                public void onClick(final DialogInterface dialogInterface, final int n) {
                    dialogInterface.cancel();
                }
            });
            alertDialog$Builder.show();
        }
    }

    private static void b(final View view, final int n) {
        while (true) {
            while (true) {
                int n2 = 0;
                Label_0060: {
                    try {
                        if (view instanceof ViewGroup) {
                            final ViewGroup viewGroup = (ViewGroup)view;
                            n2 = 0;
                            if (n2 < viewGroup.getChildCount()) {
                                final View child = viewGroup.getChildAt(n2);
                                if (child != null) {
                                    a(child, n);
                                }
                                break Label_0060;
                            }
                        }
                        else {
                            a(view, n);
                        }
                        return;
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                        return;
                    }
                }
                ++n2;
                continue;
            }
        }
    }

    public static void clickcopytext(final TextView textView) {
        textView.setOnClickListener((View.OnClickListener)new ak(textView.getText().toString()));
    }

    public static int contactLasSeenString() {
        return getResID("conversation_last_seen", "string");
    }

    public static int contactOfflineString() {
        return getResID("offline_str", "string");
    }

    public static int contactOnlineString() {
        return getResID("conversation_contact_online", "string");
    }

    public static int contactStatusString() {
        return getResID("contact_status", "string");
    }

    public static void convsContactName(final View view) {
        ((TextView)view.findViewById(getResID("conversations_row_contact_name", "id"))).setTextColor(getColor("ModContactNameColor", mainTextColor()));
    }

    public static void copyFile(final String s, final String s2) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        Label_0086: {
            try {
                final File file = new File(s);
                final File file2 = new File(s2);
                fileInputStream = new FileInputStream(file);
                fileOutputStream = new FileOutputStream(file2);
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = fileInputStream.read(array);
                    if (read <= 0) {
                        break Label_0086;
                    }
                    fileOutputStream.write(array, 0, read);
                }
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            return;
        }
        try {
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean enable() {
        return true;
    }

    public static int getActionBarColor() {
        return Color.parseColor("#075e54");
    }

    public static boolean getBoolean(final String s) {
        return com.B58works.B58.ctx.getSharedPreferences("B58", 0).getBoolean(s, false);
    }

    public static int getColor(final String s, final int n) {
        return com.B58works.B58.ctx.getSharedPreferences("B58", 0).getInt(s, n);
    }

    public static int getConsBackColor() {
        return Color.parseColor("#ffffff");
    }

    public static Context getCtx() {
        return com.B58works.B58.ctx;
    }

    public static int getID(final String s, final String s2) {
        int n = getfreqidq(s);
        if (n == -1) {
            n = com.B58works.B58.ctx.getResources().getIdentifier(s, s2, com.B58works.B58.ctx.getPackageName());
        }
        return n;
    }

    public static int getResID(final String s, final String s2) {
        return com.B58works.B58.ctx.getResources().getIdentifier(s, s2, com.B58works.B58.ctx.getPackageName());
    }

    public static int getfreqidq(final String s) {
        int int1 = -1;
        try {
            final Field declaredField = com.B58works.B58.n.getDeclaredField(s.toLowerCase(Locale.ENGLISH));
            int1 = declaredField.getInt(declaredField);
            return int1;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return int1;
        }
    }

    public static void init(final Context context) {
        B58$5.b = new HashMap();
        if (context instanceof Activity) {
            com.B58works.B58.ctx = context.getApplicationContext();
            Settings.sctx = context.getApplicationContext();
        }
        else {
            com.B58works.B58.ctx = context;
            Settings.sctx = context;
        }
        if (com.B58works.B58.ctx == null || Settings.sctx == null) {
            Log.d("B58Mods", "Context var initialized to NULL!!!");
        }
        PrefSet();
    }

    public static void initB58(final TextView textView) {
        if (textView.getPaddingRight() > 8 && textView.getId() == com.B58works.B58.sid) {
            textView.setOnClickListener((View.OnClickListener)new aa(textView));
        }
    }

    public static int loglist() {
        return getResID("loglist", "id");
    }

    public static int mainTextColor() {
        return getColor("ModConTextColor", Color.parseColor("#303031"));
    }

    public static int ppUpdatedString() {
        return getResID("profile_photo_updated", "string");
    }

    public static int profileNameString() {
        return getResID("profile_name", "string");
    }

    public static int readlog() {
        return getResID("readlog", "layout");
    }

    public static int readlogrow() {
        return getResID("readlogrow", "layout");
    }

    public static void setChatDateColor(final TextView textView, final j j) {
        try {
            String s;
            if (j.b.b) {
                s = "ModConTextColor";
            }
            else {
                s = "ModConTextColor";
            }
            textView.setTextColor(getColor(s, -12303292));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void setEntryMod(final MentionableEntry mentionableEntry, final Conversation conversation) {
        mentionableEntry.setTextColor(getColor("ModConTextColor", getActionBarColor()));
        mentionableEntry.setHintTextColor(getColor("ModConTextColor1", getActionBarColor()));
    }

    public static void setHomeIc(final ImageView imageView) {
        int mainTextColor = mainTextColor();
        if (getBoolean("start_bl") && mainTextColor == Color.parseColor("#303031")) {
            mainTextColor = -1;
        }
        imageView.setColorFilter(mainTextColor, PorterDuff.Mode.SRC_ATOP);
    }

    public static MenuItem setMenuC(final Menu menu) {
        return menu.add(1, getResID("openc", "id"), 0, getResID("opench", "string"));
    }

    public static MenuItem setMenuS(final Menu menu) {
        return menu.add(1, getResID("B58mods", "id"), 0, getResID("B58Mods", "string"));
    }

    public static void status(final TextView textView, final View view) {
        a(textView.getText().toString());
    }

    public static String stripJID(String substring) {
        if (substring.contains("@g.us") || substring.contains("@s.whatsapp.net") || substring.contains("@broadcast")) {
            substring = substring.substring(0, substring.indexOf("@"));
        }
        return substring;
    }

    public static void text_entry_bgChat(final View view, final Drawable drawable, final Context context) {
        drawable.setColorFilter(getColor("ModChatEntry", getActionBarColor()), PorterDuff.Mode.MULTIPLY);
    }

    public static boolean wacontactfinder(final ey ey) {
        return ey.a();
    }

}
