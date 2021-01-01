package net.tcodes.team24clan.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputLayout;
import android.support.p000v7.app.AlertDialog;
import android.widget.EditText;
import net.tcodes.team24clan.TcodesApplication;

public class DNSDialog {
    private AlertDialog.Builder adb;

    public DNSDialog(Context context) {
        TextInputLayout textInputLayout;
        EditText editText;
        AlertDialog.Builder builder;
        DialogInterface.OnClickListener onClickListener;
        Context context2 = context;
        SharedPreferences sharedPreferences = TcodesApplication.getSharedPreferences();
        new TextInputLayout(context2);
        TextInputLayout textInputLayout2 = textInputLayout;
        new EditText(context2);
        EditText editText2 = editText;
        editText2.setHint("e.g 8.8.8.8;8.8.4.4");
        editText2.setText(sharedPreferences.getString("dns_forward", ""));
        textInputLayout2.addView(editText2);
        new AlertDialog.Builder(context2);
        this.adb = builder;
        AlertDialog.Builder cancelable = this.adb.setCancelable(false);
        AlertDialog.Builder title = this.adb.setTitle((CharSequence) "DNS Forwarder");
        AlertDialog.Builder view = this.adb.setView(textInputLayout2, 40, 0, 40, 0);
        new DialogInterface.OnClickListener(this, sharedPreferences, editText2) {
            private final DNSDialog this$0;
            private final EditText val$edt;
            private final SharedPreferences val$sp;

            {
                this.this$0 = r8;
                this.val$sp = r9;
                this.val$edt = r10;
            }

            static DNSDialog access$0(AnonymousClass100000000 r4) {
                return r4.this$0;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                boolean commit = this.val$sp.edit().putString("dns_forward", this.val$edt.getText().toString()).commit();
            }
        };
        AlertDialog.Builder positiveButton = this.adb.setPositiveButton((CharSequence) "SAVE", onClickListener);
        AlertDialog.Builder negativeButton = this.adb.setNegativeButton((CharSequence) "CANCEL", (DialogInterface.OnClickListener) null);
    }

    public void show() {
        this.adb.create().show();
    }
}
