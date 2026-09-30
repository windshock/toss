package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CompositeAlgorithmSpec$Builder {
    private List<String> algorithmNames = new ArrayList();
    private List<AlgorithmParameterSpec> parameterSpecs = new ArrayList();

    public CompositeAlgorithmSpec$Builder add(String str) {
        this.algorithmNames.add(str);
        this.parameterSpecs.add(null);
        return this;
    }

    public CompositeAlgorithmSpec$Builder add(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        this.algorithmNames.add(str);
        this.parameterSpecs.add(algorithmParameterSpec);
        return this;
    }

    public CompositeAlgorithmSpec build() {
        if (this.algorithmNames.isEmpty()) {
            throw new IllegalStateException("cannot call build with no algorithm names added");
        }
        return new CompositeAlgorithmSpec(this);
    }
}
