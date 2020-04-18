package com.pradipta.profileautomate;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;

public class SetProfile extends BroadcastReceiver {
    AudioManager am;
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("Setting to profile 0");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            notificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_NONE);
            return;
        }
        am.setRingerMode(0);
    }
}
