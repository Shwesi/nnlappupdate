[![](https://jitpack.io/v/Shwesi/nnlappupdate.svg)](https://jitpack.io/#Shwesi/nnlappupdate) 

<p>ပထမဦးဆုံး <strong>build.gradle(project)</strong> ထဲက</p>
<p>&nbsp;</p>
<pre><code>allprojects {
repositories {
.......
maven { url 'https://jitpack.io' } //ဒီကုဒ္ေလးထည့္ေပးပါ။
}
}<br />=========================================
</code></pre>
<p>ၿပီးရင္ <strong>build.gradle(app)</strong> ထဲက</p>
<pre><code>dependencies {
...............</code></pre>
<pre class="kode code-toolbar  language-css"><code id="depCodeGradle" class=" kode  language-css">implementation <span class="token string">'com.github.Shwesi:nnlappupdate:</span></code>1.0.2'</pre>
<pre><code>' } <br /><br /><br />==================================<br /><br />Synce လုပ္ပါ<br /><br /><br />MainActivity ေတြင္ေအာက္က Code ကုိထည့္ပါ<br /></code></pre>
<pre style="background-color: #2b2b2b; color: #a9b7c6; font-family: 'Courier New'; font-size: 9.0pt;">@Override<br />    <span style="color: #cc7832;">protected void </span>onCreate(Bundle savedInstanceState)<br />    { <br />        <span style="color: #cc7832;">super</span>.onCreate(savedInstanceState)<span style="color: #cc7832;">;<br /></span>        setContentView(R.layout.activity_main)<span style="color: #cc7832;">;<br /><br /></span><span style="color: #cc7832;">        final </span>AppUpdater updater=<span style="color: #cc7832;">new </span>AppUpdater(<span style="color: #cc7832;">this</span>)<span style="color: #cc7832;">;<br /></span>        updater.check(<span style="color: #6a8759;">"<a href="https://www.google.com/?fbclid=IwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU" target="_blank" rel="noopener nofollow" data-ft="{&quot;tn&quot;:&quot;-U&quot;}" data-lynx-mode="hover" data-lynx-uri="https://l.facebook.com/l.php?u=https%3A%2F%2Fwww.google.com%2F%3Ffbclid%3DIwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU&amp;h=AT1lBG2XT661_678LfocMpfUTw_UIW8vXUphVdd6sZCDFr8v6sSwpVcdG8l4shBpAUctQN-SkhjxUc5Lk5bKKi6UeTKjnz856GulhSWySLizkfQMjlzcnxEcXatg9B1TmYZ1mbvQne8Fa84UOzKCEsPXaShGWc8QnA">http://www.google.com</a>"</span><span style="color: #cc7832;">,<br /></span><span style="color: #cc7832;"><br /></span><span style="color: #cc7832;">                new </span>AppUpdater.AppUpdateListener(){<br /><br />                    @Override<br />                    <span style="color: #cc7832;">public void </span>onUpdateAvaiable(String version)<br />                    {<br />                        updater.showConfirmDialog()<span style="color: #cc7832;">;<br /></span>                    }<br /><br />                    @Override<br />                    <span style="color: #cc7832;">public void </span>onError(String msg)<br />                    {<br />                        Toast.makeText(getApplicationContext()<span style="color: #cc7832;">,</span><span style="color: #6a8759;">"Error: "</span>+msg<span style="color: #cc7832;">,</span><span style="color: #6897bb;">0</span>).show()<span style="color: #cc7832;">;<br /></span>                    }<br />                })<span style="color: #cc7832;">;<br /></span>    }<br />}</pre>
<pre><code>&nbsp;</code></pre>
<p>========</p>
<p>ေအာက္က Code ကုိ Note ထဲကူးျပီး .html ျဖင့္ Save ပါ။<br /> {"versionName":"1.2.0","versionCode"<span class="_47e3 _5mfr" title="colonthree emoticon"><img class="img" role="presentation" src="https://static.xx.fbcdn.net/images/emoji.php/v9/eb4/1/16/FACE_WITH_COLON_THREE.png" alt="" width="16" height="16" /><span class="_7oe" aria-hidden="true">:3</span></span>,"isPlayStore":false,"link":"<a href="https://www.google.com/?fbclid=IwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU" target="_blank" rel="noopener nofollow" data-ft="{&quot;tn&quot;:&quot;-U&quot;}" data-lynx-mode="hover" data-lynx-uri="https://l.facebook.com/l.php?u=https%3A%2F%2Fwww.google.com%2F%3Ffbclid%3DIwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU&amp;h=AT1lBG2XT661_678LfocMpfUTw_UIW8vXUphVdd6sZCDFr8v6sSwpVcdG8l4shBpAUctQN-SkhjxUc5Lk5bKKi6UeTKjnz856GulhSWySLizkfQMjlzcnxEcXatg9B1TmYZ1mbvQne8Fa84UOzKCEsPXaShGWc8QnA">http://www.google.com</a>"}</p>
<p><br /> ========</p>
<pre><code></code></pre>
<p>versionName နဲ႔ versionCode ကို လက္ရွိ app ရဲ႕ ေနာက္ဆံုး update ေတြ ျပင္ျပင္ ေရးသြားရပါမယ္။ playStore မွာ တင္ထားရင္ isPlayStore ကို true ထားေပးပါ။ link ဆိုတာကေတာ့ အခု app ကို google drive မွာတင္၊ direct download link အျဖစ္ ေျပာင္းယူထားတဲ့ လိပ္စာ ျဖစ္ပါတယ္။ အခုနမူနာမွာေတာ့ <a href="https://l.facebook.com/l.php?u=https%3A%2F%2Fgoogle.com%2F%3Ffbclid%3DIwAR2xXgk7cE7L--uSVflm8fYN3xw9r8HoELif4S7JKL_ehNF-d9ukk5K2u68&amp;h=AT1Rn_-Dq3l7fBILdL-mfCrjv29hodd1rbCnJNkF7LJfJXeWLvd6x6EJBdKcid15PTYyvpqncLPYn1Y9B1-6kGLQL2T0P85fKmjjOAdan_HsfeC9UcPO8-QAcwlXyYS-7P1uC2bfGetjok5jwft0SRDI7VCYt0Fk7w" target="_blank" rel="noopener nofollow" data-ft="{&quot;tn&quot;:&quot;-U&quot;}" data-lynx-mode="hover">google.com</a> ပဲ ေရးထားတယ္။ တကယ့္ link ျပင္ေပးပါ။</p>
<pre><code></code></pre>
<p>MainActivity ထဲက</p>
<pre><code></code></pre>
<p><a href="https://www.google.com/?fbclid=IwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU" target="_blank" rel="noopener nofollow" data-ft="{&quot;tn&quot;:&quot;-U&quot;}" data-lynx-mode="hover" data-lynx-uri="https://l.facebook.com/l.php?u=https%3A%2F%2Fwww.google.com%2F%3Ffbclid%3DIwAR1C38vuzY31SjmEkyoI3_rNR3ecs_rK7GW8mWmqfTZSVuOVgXSCEHaT8cU&amp;h=AT1lBG2XT661_678LfocMpfUTw_UIW8vXUphVdd6sZCDFr8v6sSwpVcdG8l4shBpAUctQN-SkhjxUc5Lk5bKKi6UeTKjnz856GulhSWySLizkfQMjlzcnxEcXatg9B1TmYZ1mbvQne8Fa84UOzKCEsPXaShGWc8QnA">http://www.google.com</a></p>
<pre><code></code></pre>
<p>ကို ကိုယ့္ လိပ္စာ ေျပာင္းထားပါ။</p>
<p>AndroidManifest.xml မွာ ေအာက္က permission ၄ခု လိုပါတယ္။<br />========<br />&lt;uses-permission android:name="android.permission.INTERNET"/&gt;<br />&lt;uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/&gt;<br />&lt;uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/&gt;<br />&lt;uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/&gt;</p>
<p>========</p>
<p>&nbsp;</p>
<p>App ကို run လိုက္ရင္ ကိုယ့္ app ဟာ ေနာက္ဆံုး version 1.0 ျဖစ္လို႔ ဘာမွ ေပၚလာမွာ မဟုတ္ပါဘူး။</p>
<p>&nbsp;</p>
<p>Run လိုက္ပါ။ အလိုအေလ်ာက္ update လုပ္ႏိုင္တဲ့ apk version 1.0 ကို ရၿပီ ျဖစ္ပါတယ္။ အင္တာနက္ ဖြင့္ထားမွ update check လုပ္ပါတယ္။</p>
<p>========</p>
<pre><br />Credit :SirNyiNyiLwin<code><br /><br /><br /></code></pre>
