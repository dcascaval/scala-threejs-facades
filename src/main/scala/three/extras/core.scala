package typings.three.extras.core

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
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*

@js.native
@JSGlobal("THREE.Shape")
class Shape extends Path:
  def this(points: js.UndefOr[js.Array[Vector2]] = js.undefined) = this()

  var uuid: String = js.native
  var holes: js.Array[Path] = js.native
  def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
  def extractPoints(divisions: Double): AnonObject4 = js.native

@js.native
@JSGlobal("THREE.Font")
class Font extends js.Object:
  def this(jsondata: js.Any) = this()
  var `type`: String = js.native
  var data: String = js.native
  def generateShapes(text: String, size: Double): js.Array[Shape] = js.native

@js.native
@JSGlobal("THREE.CurvePath")
class CurvePath[T <: Vector] extends Curve[T]:

  var curves: Array[Curve[T]] = js.native
  var autoClose: Boolean = js.native
  def add(curve: Curve[T]): Unit = js.native
  def closePath(): Unit = js.native

  def getCurveLengths(): js.Array[Double] = js.native

@js.native
@JSGlobal("THREE.Path")
class Path extends CurvePath[Vector2]:
  def this(points: js.UndefOr[js.Array[Vector2]] = js.undefined) = this()

  var currentPoint: Vector2 = js.native
  def fromPoints(vectors: js.Array[Vector2]): this.type = js.native
  def setFromPoints(vectors: js.Array[Vector2]): this.type = js.native
  def moveTo(x: Double, y: Double): this.type = js.native
  def lineTo(x: Double, y: Double): this.type = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
  def bezierCurveTo(
      aCP1x: Double,
      aCP1y: Double,
      aCP2x: Double,
      aCP2y: Double,
      aX: Double,
      aY: Double
  ): this.type = js.native
  def splineThru(pts: js.Array[Vector2]): this.type = js.native
  def arc(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
  ): this.type = js.native
  def absarc(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
  ): this.type = js.native
  def ellipse(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
  ): this.type = js.native
  def absellipse(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
  ): this.type = js.native

@js.native
@JSGlobal("THREE.Curve")
class Curve[T <: Vector] extends js.Object:
  var `type`: String = js.native
  var arcLengthDivisions: Double = js.native
  def getPoint(t: Double, optionalTarget: js.UndefOr[T] = js.undefined): T = js.native
  def getPointAt(u: Double, optionalTarget: js.UndefOr[T] = js.undefined): T = js.native
  def getPoints(divisions: js.UndefOr[Double] = js.undefined): js.Array[T] = js.native
  def getSpacedPoints(divisions: js.UndefOr[Double] = js.undefined): js.Array[T] = js.native
  def getLength(): Double = js.native
  def getLengths(divisions: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
  def updateArcLengths(): Unit = js.native
  def getUtoTmapping(u: Double, distance: Double): Double = js.native
  def getTangent(t: Double, optionalTarget: js.UndefOr[T] = js.undefined): T = js.native
  def getTangentAt(u: Double, optionalTarget: js.UndefOr[T] = js.undefined): T = js.native
  def computeFrenetFrames(segments: Double, closed: js.UndefOr[Boolean] = js.undefined): AnonObject5 =
    js.native
  @JSName("clone")
  def jsClone(): this.type = js.native
  def copy(source: Curve[T]): this.type = js.native
  def toJSON(): js.Object = js.native
  def fromJSON(json: js.Object): this.type = js.native

@js.native
@JSGlobal("THREE.Curve")
object Curve extends js.Object:
  def create(constructorFunc: js.Function0[Unit], getPointFunc: js.Function0[Unit]): js.Function0[Unit] =
    js.native

@js.native
@JSGlobal("THREE.ShapePath")
class ShapePath extends js.Object:
  var `type`: String = js.native
  var color: Color = js.native
  var subPaths: js.Array[js.Any] = js.native
  var currentPath: js.Any = js.native
  def moveTo(x: Double, y: Double): this.type = js.native
  def lineTo(x: Double, y: Double): this.type = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
  def bezierCurveTo(
      aCP1x: Double,
      aCP1y: Double,
      aCP2x: Double,
      aCP2y: Double,
      aX: Double,
      aY: Double
  ): this.type = js.native
  def splineThru(pts: js.Array[Vector2]): this.type = js.native
  def toShapes(isCCW: Boolean, noHoles: js.UndefOr[Boolean] = js.undefined): js.Array[Shape] = js.native

@js.native
sealed trait AnonObject5 extends js.Object:
  var tangents: js.Array[Vector3] = js.native
  var normals: js.Array[Vector3] = js.native
  var binormals: js.Array[Vector3] = js.native

@js.native
sealed trait AnonObject4 extends js.Object:
  var shape: js.Array[Vector2] = js.native
  var holes: js.Array[js.Array[Vector2]] = js.native
