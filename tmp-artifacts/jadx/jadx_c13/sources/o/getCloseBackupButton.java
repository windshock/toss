package o;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import o.hideCountDownText;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCloseBackupButton extends hideCountDownText {
    private final List<hideCountDownText> onExtraCallbackWithResult;

    public getCloseBackupButton(hideCountDownText... hidecountdowntextArr) {
        final ArrayList arrayList = new ArrayList();
        this.onExtraCallbackWithResult = arrayList;
        if (hidecountdowntextArr != null) {
            Stream.of((Object[]) hidecountdowntextArr).filter(new Predicate() { // from class: org.apache.commons.text.translate.AggregateTranslator$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((hideCountDownText) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.commons.text.translate.AggregateTranslator$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add((hideCountDownText) obj);
                }
            });
        }
    }

    @Override // o.hideCountDownText
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        Iterator<hideCountDownText> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int iIAuthTabCallback = it.next().IAuthTabCallback(charSequence, i, writer);
            if (iIAuthTabCallback != 0) {
                return iIAuthTabCallback;
            }
        }
        return 0;
    }
}
