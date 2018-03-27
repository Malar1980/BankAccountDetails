package com.malar;

public interface DefaultMethodInterface {
	void callMe();
	default void callMeToo()
	{

		System.out.println("Welcome to Default Implementation Method from Interface");
}

}
