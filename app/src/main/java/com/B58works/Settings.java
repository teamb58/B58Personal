package com.B58works;

import com.whatsapp.pb;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.preference.Preference;

/**
 * Created by Bharath.R(58) on 16-11-2017.
 */
public class Settings extends pb implements Preference.OnPreferenceClickListener {
    public static Context sctx;

    public void onBackPressed() {
        super.onBackPressed();
        Process.killProcess(Process.myPid());
    }

    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Settings.sctx = (Context)this;
        this.getPreferenceManager().setSharedPreferencesName("B58");
        this.addPreferencesFromResource(B58.getResID("B58_settings", "xml"));
        this.findPreference((CharSequence)"clear_logs").setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
    }

    public boolean onPreferenceClick(final Preference preference) {
        if (preference.getKey().equals("clear_logs")) {
            B58.ClearLogs((Context)this);
        }
        return false;
    }

    public void onResume() {
        super.onResume();
    }
}
