package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.model.PlayableAdInfoResponse;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DERObjectIdentifier;
import o.adInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERObjectIdentifier {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final DERObjectIdentifier IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    public static final int onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    private static final wie2 onNavigationEvent;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(adinfo);
        }
        onWarmupCompleted(adinfo);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ PlayableAdInfoResponse onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        PlayableAdInfoResponse playableAdInfoResponseOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return playableAdInfoResponseOnWarmupCompleted;
    }

    private DERObjectIdentifier() {
    }

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new DERObjectIdentifier();
        onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.ads.NativeTestObject$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return DERObjectIdentifier.onExtraCallback((adInfo) obj);
            }
        }, 1, (Object) null);
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.NativeTestObject$$ExternalSyntheticLambda1
            public final Object invoke() {
                return DERObjectIdentifier.onNavigationEvent();
            }
        });
        onExtraCallback = 8;
        int i = asBinder + 71;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 93 / 0;
        }
    }

    private static final Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(false);
            adinfo.onNavigationEvent(true);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
        }
        return Unit.INSTANCE;
    }

    public final PlayableAdInfoResponse onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PlayableAdInfoResponse playableAdInfoResponse = (PlayableAdInfoResponse) onExtraCallbackWithResult.getValue();
        int i4 = onTransact + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return playableAdInfoResponse;
    }

    private static final PlayableAdInfoResponse onWarmupCompleted() throws Throwable {
        wie2 wie2Var;
        jp jpVarSerializer;
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            wie2Var = onNavigationEvent;
            wie2Var.onExtraCallback();
            jpVarSerializer = (jp) PlayableAdInfoResponse.Companion.serializer();
            char[] cArr = new char[931];
            ByteBuffer.wrap("-\u009aÕÂÊ\u0007=\u001d-á!X#\u0007à\u008dÿø\u0013{q\u0003\u0092Ï\u0089 LòG\u0085¿\u001e[o¾¡\u0095ßiUd«èpø\u000b\u001b§6úÚ2ÎEÅ\u0085Àn7¿\u001cËöx\u0092(aþbÅ W¿ºSp±ORÙI®\u008db\u0087\u0014|×\u001b5þýÕÔ)Y%;(æ;\u008eÛ\u000eö´\u001a&\u000eH\u0085Þ\u0080©t<\\\u000e·\u0080R5¡³¢Ã`^|u\u0093ÿð\u0095\u0012\f\tóÍ6Ç\b<ÝÛ¶?s\u0015\u001eî\u008cåxh¾{Â\u009b\u0000·(Z÷I\u0090E\f@è´6\u009c\nwÈ\u0012¬æwâ\t!\u0099<7Ó¡0ÈÒXÎ4\rö\u0006Êü\u0019\u009bÿ\u007f!US®\u0083¥²©f»\nX\u0081w8\u009aþ\u0089\u00ad\u0005\r\u0001zô°ß\u008b7\fÒô&6\"NáÃü½\u0010Gp\u0015\u0093\u0081\u008e8MèF\u0087¼\u000fX)¿ç\u0094\u0097n\beèé&ûH\u0018Þ7©Û(ÉHÊÂÁm4·\u001fÅ÷\u0012\u0093/fàm\u008b¡P¼òP&°SSÝN©\u0082(\u0086H}Â\u0018mÿ¥ÔÐ.\u0003*4)ó:\u0091Ø\b÷è\u001b|\tD\u008aÂ\u0081·u4_\u0002´\u0095Sn¦·\u00adÕaC};\u0090þóÚ\u0013\u000b\u000eûÂ>ÆT=ÈØø<>\u0014mïÍê:iðzÆ\u0098]´*[°HÝJMAáµX\u009f\u0007t\u008d\u0013úç2íE&\u008c=jÐ¢3ôÓYÏ5\u0002à\u0001\u0082ý8\u0098è|>T\u0005¯\u0097ªú®|º\u0012Y\u0081tv\u009bþ\u0088\u00ad\n\r\u0006zõ²ÞÇ4OÓê'>-FæÔý\u0089\u0011fs\b\u0090\u009f\u008f\u007fB\u0087AÕ½AYx¼¨\u0097Ço\u0003jïî>úK\u0019§4úØ2È\u001aËÁÆ\u00105ò\u001e\u0087ô\u000f\u00903gýl\u0094¦,½êQ\"³nPÃO©\u0083f\u0081\u0006\u0002\u0081\u0019vüð×\u009d/\r+4.ç%\u008bÙ\u0001ô¶\u0018X\b\u0007\u008b\u008d\u0086øJw^\tµ\u0089PY§³¬ÕfIbx\u0091¨òÇ\u0010\u0016\u000f\u0090ÃrÁ\u0007Â\u008dÙú=0\u0017\u0013ì\u0084ënn¾eÂ\u0099\u000fµ`X²KÅ\u008e!ú\u008eFÎ3J°}ÑÆäNì\tà\u0099ç®\u0010Î2\u0087\u0015apN\u0003²ÌÙG)_\u000e}pW\u000b¬§«ú¯2¥G^Íu8\u0098¦\u008bÎ\u000bY\u00076Ê÷Ù 5\u001fÐû$6,NçÈâ´\u0016frE\u0091×\u008c:C©@\u00adB\r^z½²\u0096ÇlMkºïpåT\u001eÙ5»Ù`Ë\u0013È®Çu\n¾\u0019Èõ_\u0091xd¨oÇ§O¢¹V\u0014²aQïLâ\u0080\"\u0080W\u0003Ï\u001e6ýØÖ\u0087,\r(z/²$ÇÞMõ¸\u00197\u000bI\u0088É\u0087\u0099K}Y\u000bº\u0082Qh¤ð¯\u009dg\rcx\u0096±ý×\u0011]\fªÀbÀ\u0017Ã\u009dÞø2\u0018\u0016GíÍè:oòdÚ\u009e\u0001ºPY²JÇHMGº\u008bp\u0099TzØ\u0011¸åFï\u000e$\u0099#vÖ·=\u0085Ñ\u0017Íz\u0000°Æ«?yR\u0006ß?V\u0007\u00adÞ¨¯¬p¤\u0013_\u0084zn\u0099¾\u008aÂ\b\u000f\u0004vË\u0098ØÇ:MÑº%r/\u0005äÄã·\u0017s}\u0000\u0096\u0088\u008dO@ CËC\u000f_`²²\u0091Åm\u0005hîì&äW\u001fÞ:àÞ=ÊHÉ\u008eÄ~\u000b¼\u0018\u0089úO\u0096(eón\u0089¤\t£üW7½SVÎM²\u0081<\u0083\u000e\u0000\u0082\u001f5ò»ÑÃ-O)\n,Ê'Ñß\u0018ú¬\u001ea\nb\u0089\u0082\u0084\u00adH=X_»ÝV*¥ý®Ïd\u0002`b\u0097¢ü×\u0016B\rîÁ:ÃBÀÀß¿3=\u0011\u0003ò\u008céhl¹g\u0088\u009fD»9^ýµ\u0089ICDê\u0088<\u0098@{\u0092\u0016¹ú/îV%\u008f b×»<ÃÖ\u001bòn\u0001ß\u0002\u0092\u0080\u001d\u009f\u00ads3QD²×©¿\u00ade§4\\¬{C\u009e\u009fõÿ\t\u000b\u0005.È¯ÛÖ;ZÖ\u00ad:a.\u0017å\u009càè\u0014!|_\u0097Ô²,AæB\u0090@\u0003\\*³ü\u0090\u0080rOi¶íXç\u0007\u001c\u008d;úß25EÎ\u008eÅn\b³\u001bóûH\u0097\"zæiÅ¥W ºTpp\u0019\u0092éÎ.(\"\u0082E\u0001Á\u001c\u0010óòÐ\u00872\r.z-°&\u008bÜ\u0004ûé\u001f&ud\u008eÂ\u0085´If[\u0002¸\u0083Wnºð©\u009de\ra\u0001\u0094\u0098ÿÇ\u0017M2ºÆrÂ\u0007Á\u008dÜ¡0\u0018\u0010GóÍî:mòf\u0087\u009c\r¸z_²´ÅN\u0004Eù\u0089=\u009bIxä\u0017·ûsé\u0000*\u0088!OÔ ?Ë×\u000fó`\u0006²\rÅ\u0081\u0005\u009cîp&PW³Þ®à¢=¦H]\u009exn\u009f³ôÓ\u000eD\n9É¼Ú\u00938\u0002×é;!)\têÄá·\u0015=\u007f\u000e\u0094\u008e³uF¼MÔA\u0002]*°ü\u0093\u0080sBn®â*æ\b\u001dÄ8¹Ü}4\tÏÀÊn\t \u001aÈø]\u00942{ëhÉª\u001d¡ôU5¿\u0005T\u0081sÐ\u00872\u008dG\u0006Í\u001d:ðòÓ\u00873\r/z\"°!\u0083Ý\bøé\u001c1tU\u008fÄ\u008aªNfZ\u000e¹\u0082Tt»ð¨\u009dj\rfxPã<CÅÍö.Çr\u000b\u000b\u0013Ù\u001a\u008212Ö\u0016ðÍï+¥Öa\u0085\u009d'¹z\\²·ÇOMJº\u008er\u009aZy\u0081\u0014Ðø2èG+Í&:Õò>\u0087ÔVðP\u0007²\fÇ\u0086M\u009dºqrS\u0007°\u008d¯ú£0¡\u000eb\u008eyu\u009c¼÷î\u000f@\u000b;ÎõÅ\u008298Ôè8>(\u0005ë\u0097æúj0~\u000f\u0095\u0099°nG¢LÔF\u0017Bu±½\u0092\u0094p\u0019oûã&áN\"Î9ôÝf7\bÌ\u009eËi\u000eü\u0005Îù@\u0095uxûk\u0084«\u0002¦ôª!¾\bUÝp´\u0084u\u008cH\u0007Ù\u0002bñýÒÎ0N,5#ü Êâ\tùõ\u001d1wR\u008cÀ\u008b¿O|E\u0013¾ÀU|¸½«ËkIg?êàùÊ\u0015\u00140ÿÄ>ÌKÇÂÂ\u00ad6?\u0012\u0004ñ\u0085ì\u007fc±`Ì¢\u0003¾*]ü¶\u0080LOK¶\u008fX\u0085\u0007~\u008d\u0015úù2ëG(Í':*ò9\u0085ÕIñ?\u0004á\u000f\u0084\u0087\u001f\u0082óv\"RS±Ä¬µ | Ec×~:\u009dð?g¢%\bz\u000e¶\n¿ë5oî9rþ{8ý ®Ó7¸{\u009aÍv\u008b\u0085ãO\u0085G'Cz¶²\u009dÇqMlºàràZ#§>úÒ26GÍÍÈG\u000fØ\u0004\u0087þ\r\u009a'y\u0098j\u009a".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 931);
            Object[] objArr = new Object[1];
            a(cArr, 0 - ImageFormat.getBitsPerPixel(0), objArr);
            obj = objArr[0];
        } else {
            wie2Var = onNavigationEvent;
            wie2Var.onExtraCallback();
            jpVarSerializer = PlayableAdInfoResponse.Companion.serializer();
            char[] cArr2 = new char[931];
            ByteBuffer.wrap("-\u009aÕÂÊ\u0007=\u001d-á!X#\u0007à\u008dÿø\u0013{q\u0003\u0092Ï\u0089 LòG\u0085¿\u001e[o¾¡\u0095ßiUd«èpø\u000b\u001b§6úÚ2ÎEÅ\u0085Àn7¿\u001cËöx\u0092(aþbÅ W¿ºSp±ORÙI®\u008db\u0087\u0014|×\u001b5þýÕÔ)Y%;(æ;\u008eÛ\u000eö´\u001a&\u000eH\u0085Þ\u0080©t<\\\u000e·\u0080R5¡³¢Ã`^|u\u0093ÿð\u0095\u0012\f\tóÍ6Ç\b<ÝÛ¶?s\u0015\u001eî\u008cåxh¾{Â\u009b\u0000·(Z÷I\u0090E\f@è´6\u009c\nwÈ\u0012¬æwâ\t!\u0099<7Ó¡0ÈÒXÎ4\rö\u0006Êü\u0019\u009bÿ\u007f!US®\u0083¥²©f»\nX\u0081w8\u009aþ\u0089\u00ad\u0005\r\u0001zô°ß\u008b7\fÒô&6\"NáÃü½\u0010Gp\u0015\u0093\u0081\u008e8MèF\u0087¼\u000fX)¿ç\u0094\u0097n\beèé&ûH\u0018Þ7©Û(ÉHÊÂÁm4·\u001fÅ÷\u0012\u0093/fàm\u008b¡P¼òP&°SSÝN©\u0082(\u0086H}Â\u0018mÿ¥ÔÐ.\u0003*4)ó:\u0091Ø\b÷è\u001b|\tD\u008aÂ\u0081·u4_\u0002´\u0095Sn¦·\u00adÕaC};\u0090þóÚ\u0013\u000b\u000eûÂ>ÆT=ÈØø<>\u0014mïÍê:iðzÆ\u0098]´*[°HÝJMAáµX\u009f\u0007t\u008d\u0013úç2íE&\u008c=jÐ¢3ôÓYÏ5\u0002à\u0001\u0082ý8\u0098è|>T\u0005¯\u0097ªú®|º\u0012Y\u0081tv\u009bþ\u0088\u00ad\n\r\u0006zõ²ÞÇ4OÓê'>-FæÔý\u0089\u0011fs\b\u0090\u009f\u008f\u007fB\u0087AÕ½AYx¼¨\u0097Ço\u0003jïî>úK\u0019§4úØ2È\u001aËÁÆ\u00105ò\u001e\u0087ô\u000f\u00903gýl\u0094¦,½êQ\"³nPÃO©\u0083f\u0081\u0006\u0002\u0081\u0019vüð×\u009d/\r+4.ç%\u008bÙ\u0001ô¶\u0018X\b\u0007\u008b\u008d\u0086øJw^\tµ\u0089PY§³¬ÕfIbx\u0091¨òÇ\u0010\u0016\u000f\u0090ÃrÁ\u0007Â\u008dÙú=0\u0017\u0013ì\u0084ënn¾eÂ\u0099\u000fµ`X²KÅ\u008e!ú\u008eFÎ3J°}ÑÆäNì\tà\u0099ç®\u0010Î2\u0087\u0015apN\u0003²ÌÙG)_\u000e}pW\u000b¬§«ú¯2¥G^Íu8\u0098¦\u008bÎ\u000bY\u00076Ê÷Ù 5\u001fÐû$6,NçÈâ´\u0016frE\u0091×\u008c:C©@\u00adB\r^z½²\u0096ÇlMkºïpåT\u001eÙ5»Ù`Ë\u0013È®Çu\n¾\u0019Èõ_\u0091xd¨oÇ§O¢¹V\u0014²aQïLâ\u0080\"\u0080W\u0003Ï\u001e6ýØÖ\u0087,\r(z/²$ÇÞMõ¸\u00197\u000bI\u0088É\u0087\u0099K}Y\u000bº\u0082Qh¤ð¯\u009dg\rcx\u0096±ý×\u0011]\fªÀbÀ\u0017Ã\u009dÞø2\u0018\u0016GíÍè:oòdÚ\u009e\u0001ºPY²JÇHMGº\u008bp\u0099TzØ\u0011¸åFï\u000e$\u0099#vÖ·=\u0085Ñ\u0017Íz\u0000°Æ«?yR\u0006ß?V\u0007\u00adÞ¨¯¬p¤\u0013_\u0084zn\u0099¾\u008aÂ\b\u000f\u0004vË\u0098ØÇ:MÑº%r/\u0005äÄã·\u0017s}\u0000\u0096\u0088\u008dO@ CËC\u000f_`²²\u0091Åm\u0005hîì&äW\u001fÞ:àÞ=ÊHÉ\u008eÄ~\u000b¼\u0018\u0089úO\u0096(eón\u0089¤\t£üW7½SVÎM²\u0081<\u0083\u000e\u0000\u0082\u001f5ò»ÑÃ-O)\n,Ê'Ñß\u0018ú¬\u001ea\nb\u0089\u0082\u0084\u00adH=X_»ÝV*¥ý®Ïd\u0002`b\u0097¢ü×\u0016B\rîÁ:ÃBÀÀß¿3=\u0011\u0003ò\u008céhl¹g\u0088\u009fD»9^ýµ\u0089ICDê\u0088<\u0098@{\u0092\u0016¹ú/îV%\u008f b×»<ÃÖ\u001bòn\u0001ß\u0002\u0092\u0080\u001d\u009f\u00ads3QD²×©¿\u00ade§4\\¬{C\u009e\u009fõÿ\t\u000b\u0005.È¯ÛÖ;ZÖ\u00ad:a.\u0017å\u009càè\u0014!|_\u0097Ô²,AæB\u0090@\u0003\\*³ü\u0090\u0080rOi¶íXç\u0007\u001c\u008d;úß25EÎ\u008eÅn\b³\u001bóûH\u0097\"zæiÅ¥W ºTpp\u0019\u0092éÎ.(\"\u0082E\u0001Á\u001c\u0010óòÐ\u00872\r.z-°&\u008bÜ\u0004ûé\u001f&ud\u008eÂ\u0085´If[\u0002¸\u0083Wnºð©\u009de\ra\u0001\u0094\u0098ÿÇ\u0017M2ºÆrÂ\u0007Á\u008dÜ¡0\u0018\u0010GóÍî:mòf\u0087\u009c\r¸z_²´ÅN\u0004Eù\u0089=\u009bIxä\u0017·ûsé\u0000*\u0088!OÔ ?Ë×\u000fó`\u0006²\rÅ\u0081\u0005\u009cîp&PW³Þ®à¢=¦H]\u009exn\u009f³ôÓ\u000eD\n9É¼Ú\u00938\u0002×é;!)\têÄá·\u0015=\u007f\u000e\u0094\u008e³uF¼MÔA\u0002]*°ü\u0093\u0080sBn®â*æ\b\u001dÄ8¹Ü}4\tÏÀÊn\t \u001aÈø]\u00942{ëhÉª\u001d¡ôU5¿\u0005T\u0081sÐ\u00872\u008dG\u0006Í\u001d:ðòÓ\u00873\r/z\"°!\u0083Ý\bøé\u001c1tU\u008fÄ\u008aªNfZ\u000e¹\u0082Tt»ð¨\u009dj\rfxPã<CÅÍö.Çr\u000b\u000b\u0013Ù\u001a\u008212Ö\u0016ðÍï+¥Öa\u0085\u009d'¹z\\²·ÇOMJº\u008er\u009aZy\u0081\u0014Ðø2èG+Í&:Õò>\u0087ÔVðP\u0007²\fÇ\u0086M\u009dºqrS\u0007°\u008d¯ú£0¡\u000eb\u008eyu\u009c¼÷î\u000f@\u000b;ÎõÅ\u008298Ôè8>(\u0005ë\u0097æúj0~\u000f\u0095\u0099°nG¢LÔF\u0017Bu±½\u0092\u0094p\u0019oûã&áN\"Î9ôÝf7\bÌ\u009eËi\u000eü\u0005Îù@\u0095uxûk\u0084«\u0002¦ôª!¾\bUÝp´\u0084u\u008cH\u0007Ù\u0002bñýÒÎ0N,5#ü Êâ\tùõ\u001d1wR\u008cÀ\u008b¿O|E\u0013¾ÀU|¸½«ËkIg?êàùÊ\u0015\u00140ÿÄ>ÌKÇÂÂ\u00ad6?\u0012\u0004ñ\u0085ì\u007fc±`Ì¢\u0003¾*]ü¶\u0080LOK¶\u008fX\u0085\u0007~\u008d\u0015úù2ëG(Í':*ò9\u0085ÕIñ?\u0004á\u000f\u0084\u0087\u001f\u0082óv\"RS±Ä¬µ | Ec×~:\u009dð?g¢%\bz\u000e¶\n¿ë5oî9rþ{8ý ®Ó7¸{\u009aÍv\u008b\u0085ãO\u0085G'Cz¶²\u009dÇqMlºàràZ#§>úÒ26GÍÍÈG\u000fØ\u0004\u0087þ\r\u009a'y\u0098j\u009a".getBytes("ISO-8859-1")).asCharBuffer().get(cArr2, 0, 931);
            Object[] objArr2 = new Object[1];
            a(cArr2, ImageFormat.getBitsPerPixel(0) + 1, objArr2);
            obj = objArr2[0];
        }
        return (PlayableAdInfoResponse) wie2Var.onExtraCallback(jpVarSerializer, ((String) obj).intern());
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 45813), 84 - Color.argb(0, 0, 0, 0), 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 19 - (KeyEvent.getMaxKeyCode() >> 16), 8808 - Color.argb(0, 0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 55;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 2083279854958055324L;
    }
}
