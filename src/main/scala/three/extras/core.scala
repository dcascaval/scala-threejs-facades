package typings.three.three.extras.core

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
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.Shape")
class Shape extends Path:
	def this(points: js.UndefOr[js.Array[Vector2]]) = this()
	val `type`: String = js.native;
	val uuid: String = js.native;
	val holes: js.Array[Path] = js.native;
	def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
	def extractPoints(divisions: Double): objectType5 = js.native

@js.native
@JSGlobal("THREE.Font")
class Font extends js.Object:
	def this(jsondata: js.Any) = this()
	val `type`: String = js.native;
	val data: String = js.native;
	def generateShapes(text: String, size: Double): js.Array[Shape] = js.native

@js.native
@JSGlobal("THREE.CurvePath")
class CurvePath[T <: Vector] extends Curve[T]:
	val `type`: String = js.native;
	val curves: Array[Curve[T]] = js.native;
	val autoClose: Boolean = js.native;
	def add(curve: Curve[T]): Unit = js.native
	def closePath(): Unit = js.native
	def getPoint(t: Double): T = js.native
	def getCurveLengths(): js.Array[Double] = js.native

@js.native
@JSGlobal("THREE.Path")
class Path extends CurvePath[Vector2]:
	def this(points: js.UndefOr[js.Array[Vector2]]) = this()
	val `type`: String = js.native;
	val currentPoint: Vector2 = js.native;
	def fromPoints(vectors: js.Array[Vector2]): this.type = js.native
	def setFromPoints(vectors: js.Array[Vector2]): this.type = js.native
	def moveTo(x: Double, y: Double): this.type = js.native
	def lineTo(x: Double, y: Double): this.type = js.native
	def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
	def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
	def splineThru(pts: js.Array[Vector2]): this.type = js.native
	def arc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): this.type = js.native
	def absarc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): this.type = js.native
	def ellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean, aRotation: Double): this.type = js.native
	def absellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean, aRotation: Double): this.type = js.native

@js.native
@JSGlobal("THREE.Curve")
class Curve[T <: Vector] extends js.Object:
	val `type`: String = js.native;
	val arcLengthDivisions: Double = js.native;
	def getPoint(t: Double, optionalTarget: js.UndefOr[T]): T = js.native
	def getPointAt(u: Double, optionalTarget: js.UndefOr[T]): T = js.native
	def getPoints(divisions: js.UndefOr[Double]): js.Array[T] = js.native
	def getSpacedPoints(divisions: js.UndefOr[Double]): js.Array[T] = js.native
	def getLength(): Double = js.native
	def getLengths(divisions: js.UndefOr[Double]): js.Array[Double] = js.native
	def updateArcLengths(): Unit = js.native
	def getUtoTmapping(u: Double, distance: Double): Double = js.native
	def getTangent(t: Double, optionalTarget: js.UndefOr[T]): T = js.native
	def getTangentAt(u: Double, optionalTarget: js.UndefOr[T]): T = js.native
	def computeFrenetFrames(segments: Double, closed: js.UndefOr[Boolean]): objectType6 = js.native
	def clone(): this.type = js.native
	def copy(source: Curve[T]): this.type = js.native
	def toJSON(): js.Object = js.native
	def fromJSON(json: js.Object): this.type = js.native


object Curve:
	def create(constructorFunc: js.Function0[Unit], getPointFunc: js.Function0[Unit]): js.Function0[Unit] = js.native

@js.native
@JSGlobal("THREE.ShapePath")
class ShapePath extends js.Object:
	val `type`: String = js.native;
	val color: Color = js.native;
	val subPaths: js.Array[js.Any] = js.native;
	val currentPath: js.Any = js.native;
	def moveTo(x: Double, y: Double): this.type = js.native
	def lineTo(x: Double, y: Double): this.type = js.native
	def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
	def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
	def splineThru(pts: js.Array[Vector2]): this.type = js.native
	def toShapes(isCCW: Boolean, noHoles: js.UndefOr[Boolean]): js.Array[Shape] = js.native

@js.native
sealed trait objectType6 extends js.Object:
	val tangents: js.Array[Vector3] = js.native;
	val normals: js.Array[Vector3] = js.native;
	val binormals: js.Array[Vector3] = js.native;

@js.native
sealed trait objectType5 extends js.Object:
	val shape: js.Array[Vector2] = js.native;
	val holes: js.Array[js.Array[Vector2]] = js.native;
