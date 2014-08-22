LimitedEditText
============================

Usage
-----
```xml
<com.github.ggilrong.widget.LimitedEditText
    android:id="@+id/limitedEditText"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:inputType="text|textMultiLine"
    app:formatter="%s/%s"
    app:limitCount="100"
    app:warningFontColor="@android:color/black"
    app:wordCountTextView="@+id/countTextView" />
<TextView
    android:id="@+id/countTextView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

Attributes
----------
* limitCount에 최대 글자수를 지정합니다.(기본 500자)

* formatter 에 표시 할 형식을 지정합니다. ex) "%s/%s" 로 지정시 현재 글자수/최대 글자수 로 표시 됨. (기본 %s/%s)

* wordCountTextView에 글자수를 표시 할 TextView ID를 지정해줍니다.

* warningFontColor에 최대 글자수에 도달 했을 때 TextView에 보여 질 색의 Resource ID를 지정 (기본 빨간색)

Listeners
---------
키보드가 숨겨 질 때 이벤트

```java
	limitedEditText.setKeyboardHideListener(new LimitedEditText.KeyboardHideListener() {

		@Override
		public void keyboardHide() {
			// TODO
		}
	});
```



