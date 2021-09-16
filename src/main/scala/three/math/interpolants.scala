package typings.three.math.interpolants

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
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
import typings.three.scenes.*
import typings.three.math.*
import typings.three.audio.*
import typings.three.lights.*

@js.native
@JSGlobal("THREE.QuaternionLinearInterpolant")
class QuaternionLinearInterpolant extends Interpolant:
  def this(
      parameterPositions: js.Any,
      samplesValues: js.Any,
      sampleSize: Double,
      resultBuffer: js.UndefOr[js.Any] = js.undefined
  ) = this()
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.DiscreteInterpolant")
class DiscreteInterpolant extends Interpolant:
  def this(
      parameterPositions: js.Any,
      samplesValues: js.Any,
      sampleSize: Double,
      resultBuffer: js.UndefOr[js.Any] = js.undefined
  ) = this()
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.CubicInterpolant")
class CubicInterpolant extends Interpolant:
  def this(
      parameterPositions: js.Any,
      samplesValues: js.Any,
      sampleSize: Double,
      resultBuffer: js.UndefOr[js.Any] = js.undefined
  ) = this()
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native

@js.native
@JSGlobal("THREE.LinearInterpolant")
class LinearInterpolant extends Interpolant:
  def this(
      parameterPositions: js.Any,
      samplesValues: js.Any,
      sampleSize: Double,
      resultBuffer: js.UndefOr[js.Any] = js.undefined
  ) = this()
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
