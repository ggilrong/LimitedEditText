package com.github.ggilrong.widget;

import android.content.res.TypedArray;

public class SimpleTypedArrayAdapter {
	private TypedArray typedArray;

	public SimpleTypedArrayAdapter(TypedArray typedArray) {
		this.typedArray = typedArray;
	}

	/**
	 * @param index
	 * @param defValue
	 * @return
	 * @see android.content.res.TypedArray#getColor(int, int)
	 */
	public int getColor(int index, int defValue) {
		return typedArray.getColor(index, defValue);
	}

	/**
	 * @param index
	 * @param defValue
	 * @return
	 * @see android.content.res.TypedArray#getInt(int, int)
	 */
	public int getInt(int index, int defValue) {
		return typedArray.getInt(index, defValue);
	}

	/**
	 * @param index
	 * @param defValue
	 * @return
	 * @see android.content.res.TypedArray#getResourceId(int, int)
	 */
	public int getResourceId(int index, int defValue) {
		return typedArray.getResourceId(index, defValue);
	}

	public static SimpleTypedArrayAdapter getInstance(TypedArray typedArray) {
		return new SimpleTypedArrayAdapter(typedArray);
	}

	/**
	 * @param index
	 * @return
	 * @see android.content.res.TypedArray#getString(int)
	 */
	public String getString(int index, String defValue) {
		String result = typedArray.getString(index);
		return result == null ? defValue : result;
	}

	/**
	 * 
	 * @see android.content.res.TypedArray#recycle()
	 */
	public void recycle() {
		typedArray.recycle();
	}

}
