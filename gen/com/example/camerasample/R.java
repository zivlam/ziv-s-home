/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.camerasample;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int cropImageStyle=0x7f010000;
        /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int highlightColor=0x7f010001;
        /** <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>changing</code></td><td>0</td><td></td></tr>
<tr><td><code>always</code></td><td>1</td><td></td></tr>
<tr><td><code>never</code></td><td>2</td><td></td></tr>
</table>
         */
        public static final int showHandles=0x7f010003;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int showThirds=0x7f010002;
    }
    public static final class color {
        public static final int crop__button_bar=0x7f050000;
        public static final int crop__button_text=0x7f050001;
        public static final int crop__selector_focused=0x7f050003;
        public static final int crop__selector_pressed=0x7f050002;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f060000;
        public static final int activity_vertical_margin=0x7f060001;
        public static final int crop__bar_height=0x7f060002;
    }
    public static final class drawable {
        public static final int crop__divider=0x7f020000;
        public static final int crop__ic_cancel=0x7f020001;
        public static final int crop__ic_done=0x7f020002;
        public static final int crop__selectable_background=0x7f020003;
        public static final int crop__texture=0x7f020004;
        public static final int crop__tile=0x7f020005;
        public static final int ic_launcher=0x7f020006;
        public static final int texture=0x7f020007;
        public static final int tile=0x7f020008;
    }
    public static final class id {
        public static final int action_select=0x7f040008;
        public static final int action_settings=0x7f040009;
        public static final int always=0x7f040001;
        public static final int btn_cancel=0x7f040006;
        public static final int btn_done=0x7f040007;
        public static final int changing=0x7f040000;
        public static final int crop_image=0x7f040005;
        public static final int done_cancel_bar=0x7f040004;
        public static final int never=0x7f040002;
        public static final int result_image=0x7f040003;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int crop__activity_crop=0x7f030001;
        public static final int crop__layout_done_cancel=0x7f030002;
    }
    public static final class menu {
        public static final int activity_main=0x7f090000;
        public static final int main=0x7f090001;
    }
    public static final class string {
        public static final int action_select=0x7f070007;
        public static final int action_settings=0x7f070001;
        public static final int app_name=0x7f070000;
        public static final int crop__cancel=0x7f070008;
        public static final int crop__done=0x7f070006;
        public static final int crop__pick_error=0x7f070005;
        public static final int crop__saving=0x7f070003;
        public static final int crop__wait=0x7f070004;
        public static final int hello_world=0x7f070002;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f080000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f080001;
        public static final int Crop=0x7f080002;
        public static final int Crop_ActionButton=0x7f080004;
        public static final int Crop_ActionButtonText=0x7f080005;
        public static final int Crop_ActionButtonText_Cancel=0x7f080007;
        public static final int Crop_ActionButtonText_Done=0x7f080006;
        public static final int Crop_DoneCancelBar=0x7f080003;
    }
    public static final class styleable {
        /** Attributes that can be used with a CropImageView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #CropImageView_highlightColor com.example.camerasample:highlightColor}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_showHandles com.example.camerasample:showHandles}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_showThirds com.example.camerasample:showThirds}</code></td><td></td></tr>
           </table>
           @see #CropImageView_highlightColor
           @see #CropImageView_showHandles
           @see #CropImageView_showThirds
         */
        public static final int[] CropImageView = {
            0x7f010001, 0x7f010002, 0x7f010003
        };
        /**
          <p>This symbol is the offset where the {@link com.example.camerasample.R.attr#highlightColor}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          @attr name com.example.camerasample:highlightColor
        */
        public static final int CropImageView_highlightColor = 0;
        /**
          <p>This symbol is the offset where the {@link com.example.camerasample.R.attr#showHandles}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>changing</code></td><td>0</td><td></td></tr>
<tr><td><code>always</code></td><td>1</td><td></td></tr>
<tr><td><code>never</code></td><td>2</td><td></td></tr>
</table>
          @attr name com.example.camerasample:showHandles
        */
        public static final int CropImageView_showHandles = 2;
        /**
          <p>This symbol is the offset where the {@link com.example.camerasample.R.attr#showThirds}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.camerasample:showThirds
        */
        public static final int CropImageView_showThirds = 1;
    };
}
