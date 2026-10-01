package o;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MinimumInteractiveComponentSizeModifierExternalSyntheticLambda0 extends MenuKtExternalSyntheticLambda6 {
    private static final Pattern IAuthTabCallback = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder onWarmupCompleted = StandardCharsets.UTF_8.newDecoder();
    private final CharsetDecoder onNavigationEvent = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // o.MenuKtExternalSyntheticLambda6
    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer) {
        String strIAuthTabCallback = IAuthTabCallback(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strIAuthTabCallback == null) {
            return new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{new ModalBottomSheetKtExternalSyntheticLambda10(bArr, null, null)});
        }
        Matcher matcher = IAuthTabCallback.matcher(strIAuthTabCallback);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{new ModalBottomSheetKtExternalSyntheticLambda10(bArr, str, str2)});
    }

    private String IAuthTabCallback(ByteBuffer byteBuffer) {
        try {
            return this.onWarmupCompleted.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.onNavigationEvent.decode(byteBuffer).toString();
                this.onNavigationEvent.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.onNavigationEvent.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.onNavigationEvent.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.onWarmupCompleted.reset();
            byteBuffer.rewind();
        }
    }
}
