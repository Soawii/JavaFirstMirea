package ru.mirea.task24.Task3;

public class ICreateMusic implements ICreateDocument
{
	String music;

	public ICreateMusic(String music) {
		this.music = music;
	}

	@Override
	public IDocument createNew()
	{
		return new MusicDocument(music);
	}

	@Override
	public IDocument createOpen()
	{
		return new MusicDocument(music);
	}
}