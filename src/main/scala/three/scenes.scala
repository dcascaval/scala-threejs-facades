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
	var name: String = js.native;
	var color: Color = js.native;
	@JSName("clone")
	def jsClone(): FogBase = js.native
	def toJSON(): js.Any = js.native

@js.native
@JSGlobal("THREE.Fog")
class Fog extends FogBase:
	def this(color: ColorRepresentation, near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()


	var near: Double = js.native;
	var far: Double = js.native;
	val isFog: Boolean = js.native;



@js.native
@JSGlobal("THREE.Scene")
class Scene extends Object3D:

	var fog: FogBase | Null = js.native;
	var overrideMaterial: Material | Null = js.native;
	var autoUpdate: Boolean = js.native;
	var background: Null | Color | Texture = js.native;
	var environment: Null | Texture = js.native;
	val isScene: Boolean = js.native;




@js.native
@JSGlobal("THREE.FogExp2")
class FogExp2 extends FogBase:
	def this(hex: Double | String, density: js.UndefOr[Double]) = this()


	var density: Double = js.native;
	val isFogExp2: Boolean = js.native;



@js.native
sealed trait objectType90 extends js.Object:
	var color: objectType91 = js.native;
	var position: objectType91 = js.native;
	var direction: objectType91 = js.native;
	var distance: objectType91 = js.native;
	var coneCos: objectType91 = js.native;
	var penumbraCos: objectType91 = js.native;
	var decay: objectType91 = js.native;

@js.native
sealed trait objectType85 extends js.Object:
	var direction: objectType91 = js.native;
	var color: objectType91 = js.native;

@js.native
sealed trait objectType89 extends js.Object:
	var color: objectType91 = js.native;
	var position: objectType91 = js.native;
	var decay: objectType91 = js.native;
	var distance: objectType91 = js.native;

@js.native
sealed trait objectType88 extends js.Object:
	var shadowBias: objectType91 = js.native;
	var shadowNormalBias: objectType91 = js.native;
	var shadowRadius: objectType91 = js.native;
	var shadowMapSize: objectType91 = js.native;

@js.native
sealed trait objectType86 extends js.Object:
	var direction: objectType91 = js.native;
	var skycolor: objectType91 = js.native;
	var groundColor: objectType91 = js.native;

@js.native
sealed trait objectType87 extends js.Object:
	var color: objectType91 = js.native;
	var position: objectType91 = js.native;
	var width: objectType91 = js.native;
	var height: objectType91 = js.native;
