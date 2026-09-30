package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setVideoBusiness implements thx9, Locator {
    static int IAuthTabCallback;
    private static final String[] asBinder;
    private static final String[] asInterface;
    private static int[] onTransact;
    static short[][] onWarmupCompleted;
    int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private String access000;
    private int access100;
    private int getInterfaceDescriptor;
    int onExtraCallback;
    int onExtraCallbackWithResult;
    private String readTypedObject;
    char[] onNavigationEvent = new char[200];
    int[] IAuthTabCallbackDefault = {8364, 65533, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 65533, 381, 65533, 65533, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 65533, 382, 376};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x010e, code lost:
    
        r6 = r8;
     */
    static {
        int[] iArr = new int[596];
        int[] iArr2 = new int[596];
        ByteBuffer.wrap("\u0000\u0000\u0000\u0001\u0000\u0000\u0000/\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0001\u0000\u0000\u0000=\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000>\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001ÿÿÿÿ\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0001\u0000\u0000\u0000 \u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0001\u0000\u0000\u0000\t\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0002\u0000\u0000\u0000'\u0000\u0000\u0000\u0007\u0000\u0000\u0000\"\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002ÿÿÿÿ\u0000\u0000\u0000\b\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0002\u0000\u0000\u0000 \u0000\u0000\u0000\u001d\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\"\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u0003\u0000\u0000\u0000'\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000>\u0000\u0000\u0000\b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000 \u0000\u0000\u0000\u0003ÿÿÿÿ\u0000\u0000\u0000\b\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0003\u0000\u0000\u0000 \u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000C\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0004ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0005\u0000\u0000\u0000D\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0005ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0006\u0000\u0000\u0000A\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0006ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0007\u0000\u0000\u0000T\u0000\u0000\u0000\u001c\u0000\u0000\u0000\b\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0007ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\b\u0000\u0000\u0000A\u0000\u0000\u0000\u001c\u0000\u0000\u0000\t\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\bÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\t\u0000\u0000\u0000[\u0000\u0000\u0000\u001c\u0000\u0000\u0000\f\u0000\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000\tÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\n\u0000\u0000\u0000<\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u000b\u0000\u0000\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\n\u0000\u0000\u0000\nÿÿÿÿ\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u000b\u0000\u0000\u0000/\u0000\u0000\u0000 \u0000\u0000\u0000\u0019\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\n\u0000\u0000\u0000\u000bÿÿÿÿ\u0000\u0000\u0000 \u0000\u0000\u0000\u0015\u0000\u0000\u0000\f\u0000\u0000\u0000]\u0000\u0000\u0000\u001b\u0000\u0000\u0000\r\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\f\u0000\u0000\u0000\fÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\r\u0000\u0000\u0000]\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u000e\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\f\u0000\u0000\u0000\rÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u000e\u0000\u0000\u0000>\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u000e\u0000\u0000\u0000]\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\f\u0000\u0000\u0000\u000eÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u000f\u0000\u0000\u0000-\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u000fÿÿÿÿ\u0000\u0000\u0000\n\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0010\u0000\u0000\u0000-\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿ\u0000\u0000\u0000\n\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0011\u0000\u0000\u0000-\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0011ÿÿÿÿ\u0000\u0000\u0000\n\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0012\u0000\u0000\u0000-\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0012\u0000\u0000\u0000>\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0012ÿÿÿÿ\u0000\u0000\u0000\n\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0013\u0000\u0000\u0000-\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0013\u0000\u0000\u0000>\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000[\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0013ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0014\u0000\u0000\u0000>\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0014ÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0016\u0000\u0000\u0000>\u0000\u0000\u0000\f\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0016\u0000\u0000\u0000 \u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\u0016\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\u0016\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0017ÿÿÿÿ\u0000\u0000\u0000\r\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0018\u0000\u0000\u0000=\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0018\u0000\u0000\u0000>\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0018ÿÿÿÿ\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0018\u0000\u0000\u0000 \u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0018\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0018\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0019\u0000\u0000\u0000>\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u0019ÿÿÿÿ\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0019\u0000\u0000\u0000 \u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u0019\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u0019\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001a\u0000\u0000\u0000/\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u001a\u0000\u0000\u0000>\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u001aÿÿÿÿ\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001a\u0000\u0000\u0000 \u0000\u0000\u0000\u0010\u0000\u0000\u0000\"\u0000\u0000\u0000\u001a\u0000\u0000\u0000\n\u0000\u0000\u0000\u0010\u0000\u0000\u0000\"\u0000\u0000\u0000\u001a\u0000\u0000\u0000\t\u0000\u0000\u0000\u0010\u0000\u0000\u0000\"\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001bÿÿÿÿ\u0000\u0000\u0000\r\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001c\u0000\u0000\u0000&\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u001c\u0000\u0000\u0000<\u0000\u0000\u0000\u0017\u0000\u0000\u0000!\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001cÿÿÿÿ\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001d\u0000\u0000\u0000>\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001dÿÿÿÿ\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001e\u0000\u0000\u0000>\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u001eÿÿÿÿ\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001e\u0000\u0000\u0000 \u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001e\u0000\u0000\u0000\n\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001e\u0000\u0000\u0000\t\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001f\u0000\u0000\u0000\"\u0000\u0000\u0000\u0007\u0000\u0000\u0000\"\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u001fÿÿÿÿ\u0000\u0000\u0000\b\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u001f\u0000\u0000\u0000 \u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u001f\u0000\u0000\u0000\n\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u001f\u0000\u0000\u0000\t\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001f\u0000\u0000\u0000 \u0000\u0000\u0000>\u0000\u0000\u0000\b\u0000\u0000\u0000\u001c\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000 \u0000\u0000\u0000 ÿÿÿÿ\u0000\u0000\u0000\b\u0000\u0000\u0000\u0015\u0000\u0000\u0000 \u0000\u0000\u0000 \u0000\u0000\u0000\u0007\u0000\u0000\u0000\"\u0000\u0000\u0000 \u0000\u0000\u0000\n\u0000\u0000\u0000\u0007\u0000\u0000\u0000\"\u0000\u0000\u0000 \u0000\u0000\u0000\t\u0000\u0000\u0000\u0007\u0000\u0000\u0000\"\u0000\u0000\u0000!\u0000\u0000\u0000!\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0013\u0000\u0000\u0000!\u0000\u0000\u0000/\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0019\u0000\u0000\u0000!\u0000\u0000\u0000<\u0000\u0000\u0000\u001b\u0000\u0000\u0000!\u0000\u0000\u0000!\u0000\u0000\u0000?\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001e\u0000\u0000\u0000!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001a\u0000\u0000\u0000!ÿÿÿÿ\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0015\u0000\u0000\u0000!\u0000\u0000\u0000 \u0000\u0000\u0000\u0012\u0000\u0000\u0000\u001c\u0000\u0000\u0000!\u0000\u0000\u0000\n\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u001c\u0000\u0000\u0000!\u0000\u0000\u0000\t\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000/\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0016\u0000\u0000\u0000\"\u0000\u0000\u0000>\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\"ÿÿÿÿ\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u0015\u0000\u0000\u0000\"\u0000\u0000\u0000 \u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\"\u0000\u0000\u0000\n\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000\"\u0000\u0000\u0000\t\u0000\u0000\u0000\u001c\u0000\u0000\u0000\"\u0000\u0000\u0000#\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000#\u0000\u0000\u0000#ÿÿÿÿ\u0000\u0000\u0000\r\u0000\u0000\u0000\u0015".getBytes("ISO-8859-1")).asIntBuffer().get(iArr2, 0, 596);
        System.arraycopy(iArr2, 0, iArr, 0, 596);
        onTransact = iArr;
        asBinder = new String[]{_UrlKt.FRAGMENT_ENCODE_SET, "A_ADUP", "A_ADUP_SAVE", "A_ADUP_STAGC", "A_ANAME", "A_ANAME_ADUP", "A_ANAME_ADUP_STAGC", "A_AVAL", "A_AVAL_STAGC", "A_CDATA", "A_CMNT", "A_DECL", "A_EMPTYTAG", "A_ENTITY", "A_ENTITY_START", "A_ETAG", "A_GI", "A_GI_STAGC", "A_LT", "A_LT_PCDATA", "A_MINUS", "A_MINUS2", "A_MINUS3", "A_PCDATA", "A_PI", "A_PITARGET", "A_PITARGET_PI", "A_SAVE", "A_SKIP", "A_SP", "A_STAGC", "A_UNGET", "A_UNSAVE_PCDATA"};
        asInterface = new String[]{_UrlKt.FRAGMENT_ENCODE_SET, "S_ANAME", "S_APOS", "S_AVAL", "S_BB", "S_BBC", "S_BBCD", "S_BBCDA", "S_BBCDAT", "S_BBCDATA", "S_CDATA", "S_CDATA2", "S_CDSECT", "S_CDSECT1", "S_CDSECT2", "S_COM", "S_COM2", "S_COM3", "S_COM4", "S_DECL", "S_DECL2", "S_DONE", "S_EMPTYTAG", "S_ENT", "S_EQ", "S_ETAG", "S_GI", "S_NCR", "S_PCDATA", "S_PI", "S_PITARGET", "S_QUOT", "S_STAGC", "S_TAG", "S_TAGWS", "S_XNCR"};
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr3 = onTransact;
            if (i3 >= iArr3.length) {
                break;
            }
            int i4 = iArr3[i3];
            if (i4 > i2) {
                i2 = i4;
            }
            int i5 = iArr3[i3 + 1];
            if (i5 > i) {
                i = i5;
            }
            i3 += 4;
        }
        IAuthTabCallback = i + 1;
        onWarmupCompleted = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2 + 1, i + 3);
        for (int i6 = 0; i6 <= i2; i6++) {
            for (int i7 = -2; i7 <= i; i7++) {
                int i8 = -1;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr4 = onTransact;
                    if (i9 >= iArr4.length) {
                        break;
                    }
                    if (i6 != iArr4[i9]) {
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i11 = iArr4[i9 + 1];
                        if (i11 != 0) {
                            if (i11 == i7) {
                                int i12 = iArr4[i9 + 2];
                                break;
                            }
                        } else {
                            i10 = iArr4[i9 + 2];
                            i8 = i9;
                        }
                    }
                    i9 += 4;
                }
                onWarmupCompleted[i6][i7 + 2] = (short) i9;
            }
        }
    }

    private void IAuthTabCallback(PushbackReader pushbackReader, int i) throws IOException {
        if (i != -1) {
            pushbackReader.unread(i);
        }
    }

    @Override // org.xml.sax.Locator
    public int getLineNumber() {
        return this.access100;
    }

    @Override // org.xml.sax.Locator
    public int getColumnNumber() {
        return this.getInterfaceDescriptor;
    }

    @Override // org.xml.sax.Locator
    public String getPublicId() {
        return this.access000;
    }

    @Override // org.xml.sax.Locator
    public String getSystemId() {
        return this.readTypedObject;
    }

    @Override // o.thx9
    public void onWarmupCompleted(String str, String str2) {
        this.access000 = str;
        this.readTypedObject = str2;
        this.IAuthTabCallback_Parcel = 0;
        this.IAuthTabCallbackStubProxy = 0;
        this.getInterfaceDescriptor = 0;
        this.access100 = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.thx9
    public void onNavigationEvent(Reader reader, thx10 thx10Var) throws SAXException, IOException {
        PushbackReader pushbackReader;
        int i;
        this.IAuthTabCallbackStub = 28;
        if (reader instanceof BufferedReader) {
            pushbackReader = new PushbackReader(reader, 5);
        } else {
            pushbackReader = new PushbackReader(new BufferedReader(reader), 5);
        }
        int i2 = pushbackReader.read();
        if (i2 != 65279) {
            IAuthTabCallback(pushbackReader, i2);
        }
        while (this.IAuthTabCallbackStub != 21) {
            int i3 = pushbackReader.read();
            if (i3 >= 128 && i3 <= 159) {
                i3 = this.IAuthTabCallbackDefault[i3 - 128];
            }
            if (i3 == 13 && (i3 = pushbackReader.read()) != 10) {
                IAuthTabCallback(pushbackReader, i3);
                i3 = 10;
            }
            if (i3 == 10) {
                this.IAuthTabCallbackStubProxy++;
                this.IAuthTabCallback_Parcel = 0;
            } else {
                this.IAuthTabCallback_Parcel++;
            }
            if (i3 >= 32 || i3 == 10 || i3 == 9 || i3 == -1) {
                short s = onWarmupCompleted[this.IAuthTabCallbackStub][((i3 < -1 || i3 >= IAuthTabCallback) ? -2 : i3) + 2];
                if (s != -1) {
                    int[] iArr = onTransact;
                    i = iArr[s + 2];
                    this.onExtraCallback = iArr[s + 3];
                } else {
                    i = 0;
                }
                switch (i) {
                    case 0:
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("HTMLScanner can't cope with ");
                        stringBuffer.append(Integer.toString(i3));
                        stringBuffer.append(" in state ");
                        stringBuffer.append(Integer.toString(this.IAuthTabCallbackStub));
                        throw new Error(stringBuffer.toString());
                    case 1:
                        thx10Var.onExtraCallbackWithResult(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 2:
                        thx10Var.onExtraCallbackWithResult(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 3:
                        thx10Var.onExtraCallbackWithResult(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.access000(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 4:
                        thx10Var.onNavigationEvent(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 5:
                        thx10Var.onNavigationEvent(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.onExtraCallbackWithResult(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 6:
                        thx10Var.onNavigationEvent(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.onExtraCallbackWithResult(this.onNavigationEvent, 0, 0);
                        thx10Var.access000(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 7:
                        thx10Var.IAuthTabCallback(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 8:
                        thx10Var.IAuthTabCallback(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.access000(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 9:
                        onNavigationEvent();
                        int i4 = this.onExtraCallbackWithResult;
                        if (i4 > 1) {
                            this.onExtraCallbackWithResult = i4 - 2;
                        }
                        thx10Var.getInterfaceDescriptor(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 10:
                        onNavigationEvent();
                        thx10Var.onWarmupCompleted(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 11:
                        thx10Var.onExtraCallback(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 12:
                        onNavigationEvent();
                        int i5 = this.onExtraCallbackWithResult;
                        if (i5 > 0) {
                            thx10Var.access100(this.onNavigationEvent, 0, i5);
                        }
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.writeTypedObject(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 13:
                        onNavigationEvent();
                        char c = (char) i3;
                        int i6 = this.IAuthTabCallbackStub;
                        if (i6 == 23 && c == '#') {
                            this.onExtraCallback = 27;
                            onExtraCallbackWithResult(i3, thx10Var);
                        } else if (i6 == 27 && (c == 'x' || c == 'X')) {
                            this.onExtraCallback = 35;
                            onExtraCallbackWithResult(i3, thx10Var);
                        } else if (i6 == 23 && Character.isLetterOrDigit(c)) {
                            onExtraCallbackWithResult(i3, thx10Var);
                        } else if (this.IAuthTabCallbackStub == 27 && Character.isDigit(c)) {
                            onExtraCallbackWithResult(i3, thx10Var);
                        } else if (this.IAuthTabCallbackStub == 35 && (Character.isDigit(c) || "abcdefABCDEF".indexOf(c) != -1)) {
                            onExtraCallbackWithResult(i3, thx10Var);
                        } else {
                            thx10Var.asInterface(this.onNavigationEvent, 1, this.onExtraCallbackWithResult - 1);
                            int iOnExtraCallbackWithResult = thx10Var.onExtraCallbackWithResult();
                            if (iOnExtraCallbackWithResult != 0) {
                                this.onExtraCallbackWithResult = 0;
                                if (iOnExtraCallbackWithResult >= 128 && iOnExtraCallbackWithResult <= 159) {
                                    iOnExtraCallbackWithResult = this.IAuthTabCallbackDefault[iOnExtraCallbackWithResult - 128];
                                }
                                if (iOnExtraCallbackWithResult >= 32 && (iOnExtraCallbackWithResult < 55296 || iOnExtraCallbackWithResult > 57343)) {
                                    if (iOnExtraCallbackWithResult <= 65535) {
                                        onExtraCallbackWithResult(iOnExtraCallbackWithResult, thx10Var);
                                    } else {
                                        int i7 = iOnExtraCallbackWithResult - Imgproc.FLOODFILL_FIXED_RANGE;
                                        onExtraCallbackWithResult((i7 >> 10) + 55296, thx10Var);
                                        onExtraCallbackWithResult((i7 & 1023) + 56320, thx10Var);
                                    }
                                }
                                if (i3 != 59) {
                                    IAuthTabCallback(pushbackReader, i3);
                                    this.IAuthTabCallback_Parcel--;
                                }
                            } else {
                                IAuthTabCallback(pushbackReader, i3);
                                this.IAuthTabCallback_Parcel--;
                            }
                            this.onExtraCallback = 28;
                        }
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                        break;
                    case 14:
                        thx10Var.getInterfaceDescriptor(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 15:
                        thx10Var.asBinder(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 16:
                        thx10Var.access100(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 17:
                        thx10Var.access100(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.access000(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 18:
                        onNavigationEvent();
                        onExtraCallbackWithResult(60, thx10Var);
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 19:
                        onNavigationEvent();
                        onExtraCallbackWithResult(60, thx10Var);
                        thx10Var.getInterfaceDescriptor(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 20:
                        onExtraCallbackWithResult(45, thx10Var);
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 21:
                        onExtraCallbackWithResult(45, thx10Var);
                        onExtraCallbackWithResult(32, thx10Var);
                        onExtraCallbackWithResult(45, thx10Var);
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 22:
                        onExtraCallbackWithResult(45, thx10Var);
                        onExtraCallbackWithResult(32, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 23:
                        onNavigationEvent();
                        thx10Var.getInterfaceDescriptor(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 24:
                        onNavigationEvent();
                        thx10Var.IAuthTabCallback_Parcel(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 25:
                        thx10Var.IAuthTabCallbackStubProxy(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 26:
                        thx10Var.IAuthTabCallbackStubProxy(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        thx10Var.IAuthTabCallback_Parcel(this.onNavigationEvent, 0, 0);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 27:
                        onExtraCallbackWithResult(i3, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 28:
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 29:
                        onExtraCallbackWithResult(32, thx10Var);
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 30:
                        thx10Var.access000(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 31:
                        IAuthTabCallback(pushbackReader, i3);
                        this.IAuthTabCallback_Parcel--;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    case 32:
                        int i8 = this.onExtraCallbackWithResult;
                        if (i8 > 0) {
                            this.onExtraCallbackWithResult = i8 - 1;
                        }
                        thx10Var.getInterfaceDescriptor(this.onNavigationEvent, 0, this.onExtraCallbackWithResult);
                        this.onExtraCallbackWithResult = 0;
                        this.IAuthTabCallbackStub = this.onExtraCallback;
                    default:
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Can't process state ");
                        stringBuffer2.append(i);
                        throw new Error(stringBuffer2.toString());
                }
            }
        }
        thx10Var.IAuthTabCallbackStub(this.onNavigationEvent, 0, 0);
    }

    private void onNavigationEvent() {
        this.getInterfaceDescriptor = this.IAuthTabCallback_Parcel;
        this.access100 = this.IAuthTabCallbackStubProxy;
    }

    @Override // o.thx9
    public void onWarmupCompleted() {
        this.onExtraCallback = 10;
    }

    private void onExtraCallbackWithResult(int i, thx10 thx10Var) throws SAXException, IOException {
        int i2 = this.onExtraCallbackWithResult;
        char[] cArr = this.onNavigationEvent;
        if (i2 >= cArr.length - 20) {
            int i3 = this.IAuthTabCallbackStub;
            if (i3 == 28 || i3 == 10) {
                thx10Var.getInterfaceDescriptor(cArr, 0, i2);
                this.onExtraCallbackWithResult = 0;
            } else {
                char[] cArr2 = new char[cArr.length << 1];
                System.arraycopy(cArr, 0, cArr2, 0, i2 + 1);
                this.onNavigationEvent = cArr2;
            }
        }
        char[] cArr3 = this.onNavigationEvent;
        int i4 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = i4 + 1;
        cArr3[i4] = (char) i;
    }
}
