package typings.three.three.animation.tracks

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
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.ColorKeyframeTrack")
class ColorKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes]) = this()


@js.native
@JSGlobal("THREE.QuaternionKeyframeTrack")
class QuaternionKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes]) = this()


@js.native
@JSGlobal("THREE.StringKeyframeTrack")
class StringKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes]) = this()


@js.native
@JSGlobal("THREE.BooleanKeyframeTrack")
class BooleanKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any]) = this()


@js.native
@JSGlobal("THREE.NumberKeyframeTrack")
class NumberKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes]) = this()


@js.native
@JSGlobal("THREE.VectorKeyframeTrack")
class VectorKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes]) = this()


@js.native
sealed trait objectType9 extends js.Object:
	var total: Double = js.native;
	var inUse: Double = js.native;
