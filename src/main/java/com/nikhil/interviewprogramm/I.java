package com.nikhil.interviewprogramm;

public interface I 
{
	void foo();
}
class A implements I
{
	public void foo()
	{

	}
}
class B implements I
{
	public void foo()
	{

	}
}
class C extends  B
{
		
	public void bar()
	{
		super.foo();
	}
}
