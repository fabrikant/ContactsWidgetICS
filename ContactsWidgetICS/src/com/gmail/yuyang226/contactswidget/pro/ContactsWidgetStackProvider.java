/**
 * 
 */
package com.gmail.yuyang226.contactswidget.pro;

import android.content.Context;
import android.graphics.Rect;

import com.gmail.yuyang226.contactswidget.pro.ui.ContactsWidgetStackConfigurationActivity;

/**
 * @author Toby Yu(yuyang226@gmail.com)
 *
 */
public class ContactsWidgetStackProvider extends ContactsWidgetDirectDialProvider {

	/**
	 * 
	 */
	public ContactsWidgetStackProvider() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.gmail.yuyang226.contactswidget.ContactsWidgetProvider#getWidgetEntryLayoutId()
	 */
	@Override
	protected int getWidgetEntryLayoutId() {
		return R.layout.contact_entry_large;
	}
	
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		super.onDeleted(context, appWidgetIds);
		for (int appWidgetId : appWidgetIds) {
			ContactsWidgetStackConfigurationActivity.deletePreference(context, appWidgetId, 
					ContactsWidgetStackConfigurationActivity.PREF_LOOPCONTACTS_PREFIX);
		}
	}

	@Override
	protected Rect getImageSize() {
		return IMAGE_SIZE_LARGE_RECT;
	}
	
	
	
}
