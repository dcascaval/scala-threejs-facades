package typings.three.extras.curves

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
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
@JSImport("three","CubicBezierCurve")
class CubicBezierCurve extends Curve[Vector2]:
	def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()

	var v0: Vector2 = js.native
	var v1: Vector2 = js.native
	var v2: Vector2 = js.native
	var v3: Vector2 = js.native

@js.native
@JSImport("three","LineCurve")
class LineCurve extends Curve[Vector2]:
	def this(v1: Vector2, v2: Vector2) = this()

	var v1: Vector2 = js.native
	var v2: Vector2 = js.native

@js.native
@JSImport("three","LineCurve3")
class LineCurve3 extends Curve[Vector3]:
	def this(v1: Vector3, v2: Vector3) = this()

	var v1: Vector3 = js.native
	var v2: Vector3 = js.native

@js.native
@JSImport("three","ArcCurve")
class ArcCurve extends EllipseCurve:
	def this(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()


@js.native
@JSImport("three","QuadraticBezierCurve")
class QuadraticBezierCurve extends Curve[Vector2]:
	def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()

	var v0: Vector2 = js.native
	var v1: Vector2 = js.native
	var v2: Vector2 = js.native

@js.native
@JSImport("three","CubicBezierCurve3")
class CubicBezierCurve3 extends Curve[Vector3]:
	def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()

	var v0: Vector3 = js.native
	var v1: Vector3 = js.native
	var v2: Vector3 = js.native
	var v3: Vector3 = js.native

@js.native
@JSImport("three","EllipseCurve")
class EllipseCurve extends Curve[Vector2]:
	def this(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean, aRotation: Double) = this()

	var aX: Double = js.native
	var aY: Double = js.native
	var xRadius: Double = js.native
	var yRadius: Double = js.native
	var aStartAngle: Double = js.native
	var aEndAngle: Double = js.native
	var aClockwise: Boolean = js.native
	var aRotation: Double = js.native

@js.native
@JSImport("three","QuadraticBezierCurve3")
class QuadraticBezierCurve3 extends Curve[Vector3]:
	def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()

	var v0: Vector3 = js.native
	var v1: Vector3 = js.native
	var v2: Vector3 = js.native

@js.native
@JSImport("three","CurveUtils")
object CurveUtils extends js.Object:
	def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
	def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
	def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
	def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native

@js.native
@JSImport("three","CatmullRomCurve3")
class CatmullRomCurve3 extends Curve[Vector3]:
	def this(points: js.UndefOr[js.Array[Vector3]] = js.undefined, closed: js.UndefOr[Boolean] = js.undefined, curveType: js.UndefOr[String] = js.undefined, tension: js.UndefOr[Double] = js.undefined) = this()

	var points: js.Array[Vector3] = js.native

@js.native
@JSImport("three","SplineCurve")
class SplineCurve extends Curve[Vector2]:
	def this(points: js.UndefOr[js.Array[Vector2]] = js.undefined) = this()

	var points: js.Array[Vector2] = js.native
