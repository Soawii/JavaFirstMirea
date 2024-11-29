package ru.mirea.task24.Task3;

public class ICreateText implements ICreateDocument
{
	String text;

	public ICreateText(String text) {
		this.text = text;
	}

	@Override
	public IDocument createNew()
	{
		return new TextDocument(text);
	}

	@Override
	public IDocument createOpen()
	{
		return new TextDocument(text);
	}
}
