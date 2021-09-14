package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object extras extends js.Object:
	
	@js.native
	JSGlobal("DataUtils")
	object DataUtils extends js.Object:
		def toHalfFloat(val: Double): Double = js.native
	
	@js.native
	JSGlobal("THREE")
	object core extends js.Object:
		@js.native
		class Shape extends js.Object:
			val type: String = js.native;
			val uuid: String = js.native;
			val holes: js.Array[Path] = js.native;
			def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
			def extractPoints(divisions: Double): objectType1 = js.native
		@js.native
		class Font extends js.Object:
			val type: String = js.native;
			val data: String = js.native;
			def generateShapes(text: String, size: Double): js.Array[Shape] = js.native
		@js.native
		class CurvePath[T <: Vector}] extends js.Object:
			val type: String = js.native;
			val curves: Array[Curve[T]] = js.native;
			val autoClose: Boolean = js.native;
			def add(curve: Curve[T]): Unit = js.native
			def closePath(): Unit = js.native
			def getPoint(t: Double): T = js.native
			def getCurveLengths(): js.Array[Double] = js.native
		@js.native
		class Path extends js.Object:
			val type: String = js.native;
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
		class Curve[T <: Vector}] extends js.Object:
			val type: String = js.native;
			val arcLengthDivisions: Double = js.native;
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
			def computeFrenetFrames(segments: Double, closed: js.UndefOr[Boolean] = js.undefined): objectType2 = js.native
			def clone(): this.type = js.native
			def copy(source: Curve[T]): this.type = js.native
			def toJSON(): js.Object = js.native
			def fromJSON(json: js.Object): this.type = js.native

		@js.native
		class ShapePath extends js.Object:
			val type: String = js.native;
			val color: Color = js.native;
			val subPaths: js.Array[js.Any] = js.native;
			val currentPath: js.Any = js.native;
			def moveTo(x: Double, y: Double): this.type = js.native
			def lineTo(x: Double, y: Double): this.type = js.native
			def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
			def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
			def splineThru(pts: js.Array[Vector2]): this.type = js.native
			def toShapes(isCCW: Boolean, noHoles: js.UndefOr[Boolean] = js.undefined): js.Array[Shape] = js.native
	
	@js.native
	JSGlobal("ImageUtils")
	object ImageUtils extends js.Object:
		def getDataURL(image: js.Any): String = js.native
		val crossOrigin: String = js.native;
		def loadTexture(url: String, mapping: js.UndefOr[Mapping] = js.undefined, onLoad: js.UndefOr[js.Function1[Texture,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[String,Unit]] = js.undefined): Texture = js.native
		def loadTextureCube(array: js.Array[String], mapping: js.UndefOr[Mapping] = js.undefined, onLoad: js.UndefOr[js.Function1[Texture,Unit]] = js.undefined, onError: js.UndefOr[js.Function1[String,Unit]] = js.undefined): Texture = js.native
	@js.nativetrait Vec2 extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
	
	@js.native
	JSGlobal("ShapeUtils")
	object ShapeUtils extends js.Object:
		def area(contour: js.Array[Vec2]): Double = js.native
		def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
		def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
	
	@js.native
	JSGlobal("THREE")
	object objects extends js.Object:
		@js.native
		class ImmediateRenderObject extends js.Object:
			var isImmediateRenderObject: true = js.native;
			val material: Material = js.native;
			val hasPositions: Boolean = js.native;
			val hasNormals: Boolean = js.native;
			val hasColors: Boolean = js.native;
			val hasUvs: Boolean = js.native;
			val positionArray: null | Float32Array = js.native;
			val normalArray: null | Float32Array = js.native;
			val colorArray: null | Float32Array = js.native;
			val uvArray: null | Float32Array = js.native;
			val count: Double = js.native;
			def render(renderCallback: js.Function0[,Unit]): Unit = js.native
	@js.native
	class PMREMGenerator extends js.Object:
		def fromScene(scene: Scene, sigma: js.UndefOr[Double] = js.undefined, near: js.UndefOr[Double] = js.undefined, far: js.UndefOr[Double] = js.undefined): WebGLRenderTarget = js.native
		def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
		def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
		def compileCubemapShader(): Unit = js.native
		def compileEquirectangularShader(): Unit = js.native
		def dispose(): Unit = js.native
	
	@js.native
	JSGlobal("THREE")
	object curves extends js.Object:
		@js.native
		class LineCurve3 extends js.Object:
			val type: String = js.native;
			val v1: Vector3 = js.native;
			val v2: Vector3 = js.native;
		@js.native
		class QuadraticBezierCurve extends js.Object:
			val type: String = js.native;
			val v0: Vector2 = js.native;
			val v1: Vector2 = js.native;
			val v2: Vector2 = js.native;
		@js.native
		class ArcCurve extends js.Object:
			val type: String = js.native;
		@js.native
		class CubicBezierCurve3 extends js.Object:
			val type: String = js.native;
			val v0: Vector3 = js.native;
			val v1: Vector3 = js.native;
			val v2: Vector3 = js.native;
			val v3: Vector3 = js.native;
		@js.native
		class LineCurve extends js.Object:
			val type: String = js.native;
			val v1: Vector2 = js.native;
			val v2: Vector2 = js.native;
		@js.native
		class SplineCurve extends js.Object:
			val type: String = js.native;
			val points: js.Array[Vector2] = js.native;
		@js.native
		class EllipseCurve extends js.Object:
			val type: String = js.native;
			val aX: Double = js.native;
			val aY: Double = js.native;
			val xRadius: Double = js.native;
			val yRadius: Double = js.native;
			val aStartAngle: Double = js.native;
			val aEndAngle: Double = js.native;
			val aClockwise: Boolean = js.native;
			val aRotation: Double = js.native;
		@js.native
		class QuadraticBezierCurve3 extends js.Object:
			val type: String = js.native;
			val v0: Vector3 = js.native;
			val v1: Vector3 = js.native;
			val v2: Vector3 = js.native;
		@js.native
		class CubicBezierCurve extends js.Object:
			val type: String = js.native;
			val v0: Vector2 = js.native;
			val v1: Vector2 = js.native;
			val v2: Vector2 = js.native;
			val v3: Vector2 = js.native;
		
		@js.native
		JSGlobal("CurveUtils")
		object CurveUtils extends js.Object:
			def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
			def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
			def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
			def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
		@js.native
		class CatmullRomCurve3 extends js.Object:
			val type: String = js.native;
			val points: js.Array[Vector3] = js.native;
