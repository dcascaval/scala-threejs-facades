package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object scenes extends js.Object:
	@js.nativetrait FogBase extends js.Object:
		val name: String = js.native;
		val color: Color = js.native;
		def clone(): FogBase = js.native
		def toJSON(): js.Any = js.native
	@js.native
	class Fog extends js.Object:
		val name: String = js.native;
		val color: Color = js.native;
		val near: Double = js.native;
		val far: Double = js.native;
		var isFog: true = js.native;
		def clone(): Fog = js.native
		def toJSON(): js.Any = js.native
	@js.native
	class Scene extends js.Object:
		val type: "Scene" = js.native;
		val fog: FogBase | null = js.native;
		val overrideMaterial: Material | null = js.native;
		val autoUpdate: Boolean = js.native;
		val background: null | Color | Texture = js.native;
		val environment: null | Texture = js.native;
		var isScene: true = js.native;
		val onBeforeRender: js.Function4[WebGLRenderer,Scene,Camera,js.Any,Unit] = js.native;
		val onAfterRender: js.Function3[WebGLRenderer,Scene,Camera,Unit] = js.native;
		def toJSON(meta: js.UndefOr[js.Any] = js.undefined): js.Any = js.native
	@js.native
	class FogExp2 extends js.Object:
		val name: String = js.native;
		val color: Color = js.native;
		val density: Double = js.native;
		var isFogExp2: true = js.native;
		def clone(): FogExp2 = js.native
		def toJSON(): js.Any = js.native
