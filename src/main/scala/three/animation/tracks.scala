package typings.three.animation.tracks

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
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
@JSImport("three","ColorKeyframeTrack")
class ColorKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes] = js.undefined) = this()


@js.native
@JSImport("three","NumberKeyframeTrack")
class NumberKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes] = js.undefined) = this()


@js.native
@JSImport("three","BooleanKeyframeTrack")
class BooleanKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any]) = this()


@js.native
@JSImport("three","VectorKeyframeTrack")
class VectorKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes] = js.undefined) = this()


@js.native
@JSImport("three","QuaternionKeyframeTrack")
class QuaternionKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes] = js.undefined) = this()


@js.native
@JSImport("three","StringKeyframeTrack")
class StringKeyframeTrack extends KeyframeTrack:
	def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: js.UndefOr[InterpolationModes] = js.undefined) = this()


@js.native
trait AnonObject9 extends js.Object:
	var total: Double = js.native
	var inUse: Double = js.native
