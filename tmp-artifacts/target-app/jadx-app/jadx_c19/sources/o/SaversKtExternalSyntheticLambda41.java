package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda41 extends SaversKtExternalSyntheticLambda40<InputStream> {
    private static final UriMatcher onWarmupCompleted;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        onWarmupCompleted = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public SaversKtExternalSyntheticLambda41(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public InputStream IAuthTabCallback(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamOnExtraCallbackWithResult = onExtraCallbackWithResult(uri, contentResolver);
        if (inputStreamOnExtraCallbackWithResult != null) {
            return inputStreamOnExtraCallbackWithResult;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    private InputStream onExtraCallbackWithResult(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = onWarmupCompleted.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return onExtraCallback(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        return onExtraCallback(contentResolver, uriLookupContact);
    }

    private InputStream onExtraCallback(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<InputStream> onNavigationEvent() {
        return InputStream.class;
    }
}
