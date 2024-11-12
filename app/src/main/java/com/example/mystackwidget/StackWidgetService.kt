package com.example.mystackwidget

import android.content.Intent
import android.widget.RemoteViewsService
import com.example.mystackwidget.adapter.StackRemoteViewsFactory

class StackWidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent): RemoteViewsFactory =
        StackRemoteViewsFactory(this.applicationContext)
}