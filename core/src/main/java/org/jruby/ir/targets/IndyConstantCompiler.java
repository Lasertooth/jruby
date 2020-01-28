package org.jruby.ir.targets;

import org.jruby.parser.StaticScope;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.builtin.IRubyObject;

import static org.jruby.util.CodegenUtils.params;
import static org.jruby.util.CodegenUtils.sig;

class IndyConstantCompiler implements ConstantCompiler {
    private IRBytecodeAdapter compiler;

    public IndyConstantCompiler(IRBytecodeAdapter compiler) {
        this.compiler = compiler;
    }

    public void searchConst(String name, boolean noPrivateConsts) {
        compiler.adapter.invokedynamic("searchConst", sig(JVM.OBJECT, params(ThreadContext.class, StaticScope.class)), ConstantLookupSite.BOOTSTRAP, name, noPrivateConsts ? 1 : 0, 1);
    }

    public void searchModuleForConst(String name, boolean noPrivateConsts, boolean callConstMissing) {
        compiler.adapter.invokedynamic("searchModuleForConst", sig(JVM.OBJECT, params(ThreadContext.class, IRubyObject.class)), ConstantLookupSite.BOOTSTRAP, name, noPrivateConsts ? 1 : 0, callConstMissing ? 1 : 0);
    }

    public void inheritanceSearchConst(String name, boolean noPrivateConsts) {
        compiler.adapter.invokedynamic("inheritanceSearchConst", sig(JVM.OBJECT, params(ThreadContext.class, IRubyObject.class)), ConstantLookupSite.BOOTSTRAP, name, noPrivateConsts ? 1 : 0, 1);
    }

    public void lexicalSearchConst(String name) {
        compiler.adapter.invokedynamic("lexicalSearchConst", sig(JVM.OBJECT, params(ThreadContext.class, StaticScope.class)), ConstantLookupSite.BOOTSTRAP, name, 0, 1);
    }
}
