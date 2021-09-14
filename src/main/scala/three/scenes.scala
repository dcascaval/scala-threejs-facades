package typings.three.three.scenes

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
sealed trait FogBase extends js.Object:
	val name: String = js.native;
	val color: Color = js.native;
	def clone(): FogBase = js.native
	def toJSON(): js.Any = js.native

@js.native
@JSGlobal("THREE.Fog")
class Fog extends FogBase:
	def this(color: ColorRepresentation, near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()
	val name: String = js.native;
	val color: Color = js.native;
	val near: Double = js.native;
	val far: Double = js.native;
	var isFog: Boolean = js.native;
	def clone(): Fog = js.native
	def toJSON(): js.Any = js.native

@js.native
@JSGlobal("THREE.Scene")
class Scene extends Object3D:
	val `type`: String = js.native;
	val fog: FogBase | Null = js.native;
	val overrideMaterial: Material | Null = js.native;
	val autoUpdate: Boolean = js.native;
	val background: Null | Color | Texture = js.native;
	val environment: Null | Texture = js.native;
	var isScene: Boolean = js.native;
	val onBeforeRender: js.Function4[WebGLRenderer,Scene,Camera,js.Any,Unit] = js.native;
	val onAfterRender: js.Function3[WebGLRenderer,Scene,Camera,Unit] = js.native;
	def toJSON(meta: js.UndefOr[js.Any]): js.Any = js.native

@js.native
@JSGlobal("THREE.FogExp2")
class FogExp2 extends FogBase:
	def this(hex: Double | String, density: js.UndefOr[Double]) = this()
	val name: String = js.native;
	val color: Color = js.native;
	val density: Double = js.native;
	var isFogExp2: Boolean = js.native;
	def clone(): FogExp2 = js.native
	def toJSON(): js.Any = js.native

@js.native
sealed trait objectType92 extends js.Object:
	val color: objectType93 = js.native;
	val position: objectType93 = js.native;
	val direction: objectType93 = js.native;
	val distance: objectType93 = js.native;
	val coneCos: objectType93 = js.native;
	val penumbraCos: objectType93 = js.native;
	val decay: objectType93 = js.native;

@js.native
sealed trait objectType87 extends js.Object:
	val direction: objectType93 = js.native;
	val color: objectType93 = js.native;

@js.native
sealed trait objectType91 extends js.Object:
	val color: objectType93 = js.native;
	val position: objectType93 = js.native;
	val decay: objectType93 = js.native;
	val distance: objectType93 = js.native;

@js.native
sealed trait objectType90 extends js.Object:
	val shadowBias: objectType93 = js.native;
	val shadowNormalBias: objectType93 = js.native;
	val shadowRadius: objectType93 = js.native;
	val shadowMapSize: objectType93 = js.native;

@js.native
sealed trait objectType88 extends js.Object:
	val direction: objectType93 = js.native;
	val skycolor: objectType93 = js.native;
	val groundColor: objectType93 = js.native;

@js.native
sealed trait objectType89 extends js.Object:
	val color: objectType93 = js.native;
	val position: objectType93 = js.native;
	val width: objectType93 = js.native;
	val height: objectType93 = js.native;
