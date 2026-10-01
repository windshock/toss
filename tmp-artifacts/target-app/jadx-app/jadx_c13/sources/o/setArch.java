package o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.RegexKt;
import o.setArch;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setArch implements MatchResult {
    private final CharSequence IAuthTabCallback;
    private final removeLogBuffers onExtraCallback;
    private final Matcher onNavigationEvent;
    private List<String> onWarmupCompleted;

    public setArch(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(matcher, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onNavigationEvent = matcher;
        this.IAuthTabCallback = charSequence;
        this.onExtraCallback = new onWarmupCompleted();
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.Destructured getDestructured() {
        return MatchResult.onExtraCallback.IAuthTabCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // kotlin.text.MatchResult
    public IntRange onExtraCallback() {
        return RegexKt.range(onWarmupCompleted());
    }

    @Override // kotlin.text.MatchResult
    public String onExtraCallbackWithResult() {
        String strGroup = onWarmupCompleted().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "");
        return strGroup;
    }

    public static final class onWarmupCompleted extends AbstractCollection<MatchGroup> implements removeOpenFds {
        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        onWarmupCompleted() {
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj == null || (obj instanceof MatchGroup)) {
                return onExtraCallback((MatchGroup) obj);
            }
            return false;
        }

        public boolean onExtraCallback(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return setArch.this.onWarmupCompleted().groupCount() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchGroup onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, int i) {
            return onwarmupcompleted.onExtraCallbackWithResult(i);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            return ensureCausesIsMutable.extraCallback(CollectionsKt___CollectionsKt.asSequence(CollectionsKt__CollectionsKt.getIndices(this)), new Function1() { // from class: kotlin.text.MatcherMatchResult$groups$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setArch.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, ((Integer) obj).intValue());
                }
            }).IAuthTabCallback();
        }

        @Override // o.removeLogBuffers
        public MatchGroup onExtraCallbackWithResult(int i) {
            IntRange intRangeRange = RegexKt.range(setArch.this.onWarmupCompleted(), i);
            if (intRangeRange.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = setArch.this.onWarmupCompleted().group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup, "");
            return new MatchGroup(strGroup, intRangeRange);
        }
    }

    @Override // kotlin.text.MatchResult
    public removeLogBuffers IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public static final class onNavigationEvent extends AbstractList<String> {
        onNavigationEvent() {
        }

        public int IAuthTabCallback(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return onExtraCallback((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return IAuthTabCallback((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return onWarmupCompleted((String) obj);
            }
            return -1;
        }

        public boolean onExtraCallback(String str) {
            return super.contains(str);
        }

        public int onWarmupCompleted(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return setArch.this.onWarmupCompleted().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = setArch.this.onWarmupCompleted().group(i);
            return strGroup == null ? _UrlKt.FRAGMENT_ENCODE_SET : strGroup;
        }
    }

    @Override // kotlin.text.MatchResult
    public List<String> getGroupValues() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new onNavigationEvent();
        }
        List<String> list = this.onWarmupCompleted;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult onNavigationEvent() {
        int iEnd = onWarmupCompleted().end() + (onWarmupCompleted().end() == onWarmupCompleted().start() ? 1 : 0);
        if (iEnd > this.IAuthTabCallback.length()) {
            return null;
        }
        Matcher matcher = this.onNavigationEvent.pattern().matcher(this.IAuthTabCallback);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return RegexKt.findNext(matcher, iEnd, this.IAuthTabCallback);
    }
}
