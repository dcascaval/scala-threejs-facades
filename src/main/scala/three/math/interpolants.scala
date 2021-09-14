package typings.three.three.math.interpolants

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
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.QuaternionLinearInterpolant")
class QuaternionLinearInterpolant extends Interpolant:
	def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.UndefOr[js.Any]) = this()
	def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.DiscreteInterpolant")
class DiscreteInterpolant extends Interpolant:
	def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.UndefOr[js.Any]) = this()
	def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.CubicInterpolant")
class CubicInterpolant extends Interpolant:
	def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.UndefOr[js.Any]) = this()
	def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.LinearInterpolant")
class LinearInterpolant extends Interpolant:
	def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.UndefOr[js.Any]) = this()
	def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
