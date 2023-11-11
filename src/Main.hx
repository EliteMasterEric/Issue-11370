package;

import java.Lib;
import test.CoolClass;
import test.CoolClass.CoolClass_Comment;
import test.CoolClass.CoolClass_Entry;
import test.TestClass;

/**
 * Main class.
 */
class Main {
    public static function main():Void {
		var clazz:java.lang.Class = Lib.toNativeType(MyClass);
        TestClass.processClass(clazz);
    }
}

class MyClass {
	@:meta(CoolClass_Entry(name = "Outer"))
	public var outer:String;

	@:meta(CoolClass_Entry(name = "Inter"))
	public var inner:String;

	@:meta(CoolClass_Comment())
	public var comment:CoolClass_Comment;

    public function new(outer:String, inner:String) {
        this.outer = outer;
        this.inner = inner;
    }

    public function getOuter():String {
        return outer;
    }

    public function getInner():String {
        return inner;
    }

    public function toString():String {
        return "CoolClass(" + outer + ":" + inner + ")";
    }
}