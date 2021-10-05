package typings.three.scenes

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
trait FogBase extends js.Object:
	var name: String = js.native
	var color: Color = js.native
	@JSName("clone")
	def jsClone(): FogBase = js.native
	def toJSON(): js.Any = js.native

@js.native
@JSImport("three","Fog")
class Fog extends FogBase:
	def this(color: ColorRepresentation, near: js.UndefOr[Double] = js.undefined, far: js.UndefOr[Double] = js.undefined) = this()


	var near: Double = js.native
	var far: Double = js.native
	val isFog: Boolean = js.native



@js.native
@JSImport("three","FogExp2")
class FogExp2 extends FogBase:
	def this(hex: Double | String, density: js.UndefOr[Double] = js.undefined) = this()


	var density: Double = js.native
	val isFogExp2: Boolean = js.native



@js.native
@JSImport("three","Scene")
class Scene extends Object3D:

	var fog: FogBase = js.native
	var overrideMaterial: Material = js.native
	var autoUpdate: Boolean = js.native
	var background: Color | Texture = js.native
	var environment: Texture = js.native
	val isScene: Boolean = js.native




@js.native
trait AnonObject90 extends js.Object:
	var color: AnonObject91 = js.native
	var position: AnonObject91 = js.native
	var direction: AnonObject91 = js.native
	var distance: AnonObject91 = js.native
	var coneCos: AnonObject91 = js.native
	var penumbraCos: AnonObject91 = js.native
	var decay: AnonObject91 = js.native

@js.native
trait AnonObject85 extends js.Object:
	var direction: AnonObject91 = js.native
	var color: AnonObject91 = js.native

@js.native
trait AnonObject89 extends js.Object:
	var color: AnonObject91 = js.native
	var position: AnonObject91 = js.native
	var decay: AnonObject91 = js.native
	var distance: AnonObject91 = js.native

@js.native
trait AnonObject88 extends js.Object:
	var shadowBias: AnonObject91 = js.native
	var shadowNormalBias: AnonObject91 = js.native
	var shadowRadius: AnonObject91 = js.native
	var shadowMapSize: AnonObject91 = js.native

@js.native
trait AnonObject86 extends js.Object:
	var direction: AnonObject91 = js.native
	var skycolor: AnonObject91 = js.native
	var groundColor: AnonObject91 = js.native

@js.native
trait AnonObject87 extends js.Object:
	var color: AnonObject91 = js.native
	var position: AnonObject91 = js.native
	var width: AnonObject91 = js.native
	var height: AnonObject91 = js.native
