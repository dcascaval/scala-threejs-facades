package typings.three.three.extras.curves

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
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.LineCurve3")
class LineCurve3 extends Curve[Vector3]:
	def this(v1: Vector3, v2: Vector3) = this()
	val `type`: String = js.native;
	val v1: Vector3 = js.native;
	val v2: Vector3 = js.native;

@js.native
@JSGlobal("THREE.QuadraticBezierCurve")
class QuadraticBezierCurve extends Curve[Vector2]:
	def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
	val `type`: String = js.native;
	val v0: Vector2 = js.native;
	val v1: Vector2 = js.native;
	val v2: Vector2 = js.native;

@js.native
@JSGlobal("THREE.ArcCurve")
class ArcCurve extends EllipseCurve:
	def this(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()
	val `type`: String = js.native;

@js.native
@JSGlobal("THREE.CubicBezierCurve3")
class CubicBezierCurve3 extends Curve[Vector3]:
	def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
	val `type`: String = js.native;
	val v0: Vector3 = js.native;
	val v1: Vector3 = js.native;
	val v2: Vector3 = js.native;
	val v3: Vector3 = js.native;

@js.native
@JSGlobal("THREE.LineCurve")
class LineCurve extends Curve[Vector2]:
	def this(v1: Vector2, v2: Vector2) = this()
	val `type`: String = js.native;
	val v1: Vector2 = js.native;
	val v2: Vector2 = js.native;

@js.native
@JSGlobal("THREE.SplineCurve")
class SplineCurve extends Curve[Vector2]:
	def this(points: js.UndefOr[js.Array[Vector2]]) = this()
	val `type`: String = js.native;
	val points: js.Array[Vector2] = js.native;

@js.native
@JSGlobal("THREE.EllipseCurve")
class EllipseCurve extends Curve[Vector2]:
	def this(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean, aRotation: Double) = this()
	val `type`: String = js.native;
	val aX: Double = js.native;
	val aY: Double = js.native;
	val xRadius: Double = js.native;
	val yRadius: Double = js.native;
	val aStartAngle: Double = js.native;
	val aEndAngle: Double = js.native;
	val aClockwise: Boolean = js.native;
	val aRotation: Double = js.native;

@js.native
@JSGlobal("THREE.QuadraticBezierCurve3")
class QuadraticBezierCurve3 extends Curve[Vector3]:
	def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
	val `type`: String = js.native;
	val v0: Vector3 = js.native;
	val v1: Vector3 = js.native;
	val v2: Vector3 = js.native;

@js.native
@JSGlobal("THREE.CubicBezierCurve")
class CubicBezierCurve extends Curve[Vector2]:
	def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
	val `type`: String = js.native;
	val v0: Vector2 = js.native;
	val v1: Vector2 = js.native;
	val v2: Vector2 = js.native;
	val v3: Vector2 = js.native;

@js.native
@JSGlobal("THREE.CurveUtils")
object CurveUtils extends js.Object:
	def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
	def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
	def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
	def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native

@js.native
@JSGlobal("THREE.CatmullRomCurve3")
class CatmullRomCurve3 extends Curve[Vector3]:
	def this(points: js.UndefOr[js.Array[Vector3]], closed: js.UndefOr[Boolean], curveType: js.UndefOr[String], tension: js.UndefOr[Double]) = this()
	val `type`: String = js.native;
	val points: js.Array[Vector3] = js.native;
