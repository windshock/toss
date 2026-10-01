package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getSignAlgType {
    private static final CharsetDecoder onNavigationEvent = StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT);
    private static final getBKMPriKeyFH onExtraCallback = new getBKMPriKeyPH("-_.!~*'()@:$&,;=[]/", false);

    public static String onExtraCallback(String str) {
        return onExtraCallback.IAuthTabCallback(str);
    }

    public static String onWarmupCompleted(ByteBuffer byteBuffer) throws CharacterCodingException {
        return onNavigationEvent.decode(byteBuffer).toString();
    }
}
