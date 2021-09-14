package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object math extends js.Object:
	@js.native
	class Plane extends js.Object:
		val normal: Vector3 = js.native;
		val constant: Double = js.native;
		var isPlane: true = js.native;
		def set(normal: Vector3, constant: Double): Plane = js.native
		def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = js.native
		def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
		def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
		def clone(): this.type = js.native
		def copy(plane: Plane): this.type = js.native
		def normalize(): Plane = js.native
		def negate(): Plane = js.native
		def distanceToPoint(point: Vector3): Double = js.native
		def distanceToSphere(sphere: Sphere): Double = js.native
		def projectPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def orthoPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def intersectLine(line: Line3, target: Vector3): Vector3 | null = js.native
		def intersectsLine(line: Line3): Boolean = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def intersectsSphere(sphere: Sphere): Boolean = js.native
		def coplanarPoint(target: Vector3): Vector3 = js.native
		def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: js.UndefOr[Matrix3] = js.undefined): Plane = js.native
		def translate(offset: Vector3): Plane = js.native
		def equals(plane: Plane): Boolean = js.native
		def isIntersectionLine(l: js.Any): js.Any = js.native
	val DEG2RAD: Double = js.native;
	val RAD2DEG: Double = js.native;
	def generateUUID(): String = js.native
	def clamp(value: Double, min: Double, max: Double): Double = js.native
	def euclideanModulo(n: Double, m: Double): Double = js.native
	def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
	def smoothstep(x: Double, min: Double, max: Double): Double = js.native
	def smootherstep(x: Double, min: Double, max: Double): Double = js.native
	def random16(): Double = js.native
	def randInt(low: Double, high: Double): Double = js.native
	def randFloat(low: Double, high: Double): Double = js.native
	def randFloatSpread(range: Double): Double = js.native
	def seededRandom(seed: js.UndefOr[Double] = js.undefined): Double = js.native
	def degToRad(degrees: Double): Double = js.native
	def radToDeg(radians: Double): Double = js.native
	def isPowerOfTwo(value: Double): Boolean = js.native
	def inverseLerp(x: Double, y: Double, t: Double): Double = js.native
	def lerp(x: Double, y: Double, t: Double): Double = js.native
	def damp(x: Double, y: Double, lambda: Double, dt: Double): Double = js.native
	def pingpong(x: Double, length: js.UndefOr[Double] = js.undefined): Double = js.native
	def nearestPowerOfTwo(value: Double): Double = js.native
	def nextPowerOfTwo(value: Double): Double = js.native
	def floorPowerOfTwo(value: Double): Double = js.native
	def ceilPowerOfTwo(value: Double): Double = js.native
	def setQuaternionFromProperEuler(q: Quaternion, a: Double, b: Double, c: Double, order: String): Unit = js.native
	type Vector3Tuple = js.Array[Double]
	@js.native
	class Vector3 extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
		val z: Double = js.native;
		var isVector3: true = js.native;
		def set(x: Double, y: Double, z: Double): this.type = js.native
		def setScalar(scalar: Double): this.type = js.native
		def setX(x: Double): Vector3 = js.native
		def setY(y: Double): Vector3 = js.native
		def setZ(z: Double): Vector3 = js.native
		def setComponent(index: Double, value: Double): this.type = js.native
		def getComponent(index: Double): Double = js.native
		def clone(): this.type = js.native
		def copy(v: Vector3): this.type = js.native
		def add(v: Vector3): this.type = js.native
		def addScalar(s: Double): this.type = js.native
		def addScaledVector(v: Vector3, s: Double): this.type = js.native
		def addVectors(a: Vector3, b: Vector3): this.type = js.native
		def sub(a: Vector3): this.type = js.native
		def subScalar(s: Double): this.type = js.native
		def subVectors(a: Vector3, b: Vector3): this.type = js.native
		def multiply(v: Vector3): this.type = js.native
		def multiplyScalar(s: Double): this.type = js.native
		def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
		def applyEuler(euler: Euler): this.type = js.native
		def applyAxisAngle(axis: Vector3, angle: Double): this.type = js.native
		def applyMatrix3(m: Matrix3): this.type = js.native
		def applyNormalMatrix(m: Matrix3): this.type = js.native
		def applyMatrix4(m: Matrix4): this.type = js.native
		def applyQuaternion(q: Quaternion): this.type = js.native
		def project(camera: Camera): this.type = js.native
		def unproject(camera: Camera): this.type = js.native
		def transformDirection(m: Matrix4): this.type = js.native
		def divide(v: Vector3): this.type = js.native
		def divideScalar(s: Double): this.type = js.native
		def min(v: Vector3): this.type = js.native
		def max(v: Vector3): this.type = js.native
		def clamp(min: Vector3, max: Vector3): this.type = js.native
		def clampScalar(min: Double, max: Double): this.type = js.native
		def clampLength(min: Double, max: Double): this.type = js.native
		def floor(): this.type = js.native
		def ceil(): this.type = js.native
		def round(): this.type = js.native
		def roundToZero(): this.type = js.native
		def negate(): this.type = js.native
		def dot(v: Vector3): Double = js.native
		def lengthSq(): Double = js.native
		def length(): Double = js.native
		def lengthManhattan(): Double = js.native
		def manhattanLength(): Double = js.native
		def manhattanDistanceTo(v: Vector3): Double = js.native
		def normalize(): this.type = js.native
		def setLength(l: Double): this.type = js.native
		def lerp(v: Vector3, alpha: Double): this.type = js.native
		def lerpVectors(v1: Vector3, v2: Vector3, alpha: Double): this.type = js.native
		def cross(a: Vector3): this.type = js.native
		def crossVectors(a: Vector3, b: Vector3): this.type = js.native
		def projectOnVector(v: Vector3): this.type = js.native
		def projectOnPlane(planeNormal: Vector3): this.type = js.native
		def reflect(vector: Vector3): this.type = js.native
		def angleTo(v: Vector3): Double = js.native
		def distanceTo(v: Vector3): Double = js.native
		def distanceToSquared(v: Vector3): Double = js.native
		def distanceToManhattan(v: Vector3): Double = js.native
		def setFromSpherical(s: Spherical): this.type = js.native
		def setFromSphericalCoords(r: Double, phi: Double, theta: Double): this.type = js.native
		def setFromCylindrical(s: Cylindrical): this.type = js.native
		def setFromCylindricalCoords(radius: Double, theta: Double, y: Double): this.type = js.native
		def setFromMatrixPosition(m: Matrix4): this.type = js.native
		def setFromMatrixScale(m: Matrix4): this.type = js.native
		def setFromMatrixColumn(matrix: Matrix4, index: Double): this.type = js.native
		def setFromMatrix3Column(matrix: Matrix3, index: Double): this.type = js.native
		def equals(v: Vector3): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: js.UndefOr[Vector3Tuple] = js.undefined, offset: js.UndefOr[0] = js.undefined): Vector3Tuple = js.native
		def toArray(array: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def fromBufferAttribute(attribute: BufferAttribute | InterleavedBufferAttribute, index: Double): this.type = js.native
		def random(): this.type = js.native
	@js.native
	class Cylindrical extends js.Object:
		val radius: Double = js.native;
		val theta: Double = js.native;
		val y: Double = js.native;
		def clone(): this.type = js.native
		def copy(other: Cylindrical): this.type = js.native
		def set(radius: Double, theta: Double, y: Double): this.type = js.native
		def setFromVector3(vec3: Vector3): this.type = js.native
		def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
	type Vector2Tuple = js.Array[Double]
	@js.nativetrait Vector extends js.Object:
		def setComponent(index: Double, value: Double): this.type = js.native
		def getComponent(index: Double): Double = js.native
		def set(List(), a, r, g, s,  , :,  , (, j, s, ., A, r, r, a, y, [, D, o, u, b, l, e, ], ), *): this.type = js.native
		def setScalar(scalar: Double): this.type = js.native
		def copy(v: Vector): this.type = js.native
		def add(v: Vector): this.type = js.native
		def addVectors(a: Vector, b: Vector): this.type = js.native
		def addScaledVector(vector: Vector, scale: Double): this.type = js.native
		def addScalar(scalar: Double): this.type = js.native
		def sub(v: Vector): this.type = js.native
		def subVectors(a: Vector, b: Vector): this.type = js.native
		def multiplyScalar(s: Double): this.type = js.native
		def divideScalar(s: Double): this.type = js.native
		def negate(): this.type = js.native
		def dot(v: Vector): Double = js.native
		def lengthSq(): Double = js.native
		def length(): Double = js.native
		def normalize(): this.type = js.native
		def distanceTo(v: Vector): Double = js.native
		def distanceToSquared(v: Vector): Double = js.native
		def setLength(l: Double): this.type = js.native
		def lerp(v: Vector, alpha: Double): this.type = js.native
		def equals(v: Vector): Boolean = js.native
		def clone(): Vector = js.native
	@js.native
	class Vector2 extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
		val width: Double = js.native;
		val height: Double = js.native;
		var isVector2: true = js.native;
		def set(x: Double, y: Double): this.type = js.native
		def setScalar(scalar: Double): this.type = js.native
		def setX(x: Double): this.type = js.native
		def setY(y: Double): this.type = js.native
		def setComponent(index: Double, value: Double): this.type = js.native
		def getComponent(index: Double): Double = js.native
		def clone(): this.type = js.native
		def copy(v: Vector2): this.type = js.native
		def add(v: Vector2, w: js.UndefOr[Vector2] = js.undefined): this.type = js.native
		def addScalar(s: Double): this.type = js.native
		def addVectors(a: Vector2, b: Vector2): this.type = js.native
		def addScaledVector(v: Vector2, s: Double): this.type = js.native
		def sub(v: Vector2): this.type = js.native
		def subScalar(s: Double): this.type = js.native
		def subVectors(a: Vector2, b: Vector2): this.type = js.native
		def multiply(v: Vector2): this.type = js.native
		def multiplyScalar(scalar: Double): this.type = js.native
		def divide(v: Vector2): this.type = js.native
		def divideScalar(s: Double): this.type = js.native
		def applyMatrix3(m: Matrix3): this.type = js.native
		def min(v: Vector2): this.type = js.native
		def max(v: Vector2): this.type = js.native
		def clamp(min: Vector2, max: Vector2): this.type = js.native
		def clampScalar(min: Double, max: Double): this.type = js.native
		def clampLength(min: Double, max: Double): this.type = js.native
		def floor(): this.type = js.native
		def ceil(): this.type = js.native
		def round(): this.type = js.native
		def roundToZero(): this.type = js.native
		def negate(): this.type = js.native
		def dot(v: Vector2): Double = js.native
		def cross(v: Vector2): Double = js.native
		def lengthSq(): Double = js.native
		def length(): Double = js.native
		def lengthManhattan(): Double = js.native
		def manhattanLength(): Double = js.native
		def normalize(): this.type = js.native
		def angle(): Double = js.native
		def distanceTo(v: Vector2): Double = js.native
		def distanceToSquared(v: Vector2): Double = js.native
		def distanceToManhattan(v: Vector2): Double = js.native
		def manhattanDistanceTo(v: Vector2): Double = js.native
		def setLength(length: Double): this.type = js.native
		def lerp(v: Vector2, alpha: Double): this.type = js.native
		def lerpVectors(v1: Vector2, v2: Vector2, alpha: Double): this.type = js.native
		def equals(v: Vector2): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: js.UndefOr[Vector2Tuple] = js.undefined, offset: js.UndefOr[0] = js.undefined): Vector2Tuple = js.native
		def toArray(array: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
		def rotateAround(center: Vector2, angle: Double): this.type = js.native
		def random(): this.type = js.native
	type Matrix4Tuple = js.Array[Double]
	@js.native
	class Matrix4 extends js.Object:
		val elements: js.Array[Double] = js.native;
		def set(n11: Double, n12: Double, n13: Double, n14: Double, n21: Double, n22: Double, n23: Double, n24: Double, n31: Double, n32: Double, n33: Double, n34: Double, n41: Double, n42: Double, n43: Double, n44: Double): Matrix4 = js.native
		def identity(): Matrix4 = js.native
		def clone(): Matrix4 = js.native
		def copy(m: Matrix4): this.type = js.native
		def copyPosition(m: Matrix4): Matrix4 = js.native
		def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
		def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
		def extractRotation(m: Matrix4): Matrix4 = js.native
		def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
		def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
		def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
		def multiply(m: Matrix4): Matrix4 = js.native
		def premultiply(m: Matrix4): Matrix4 = js.native
		def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = js.native
		def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
		def multiplyScalar(s: Double): Matrix4 = js.native
		def determinant(): Double = js.native
		def transpose(): Matrix4 = js.native
		def setPosition(v: Vector3 | Double, y: js.UndefOr[Double] = js.undefined, z: js.UndefOr[Double] = js.undefined): Matrix4 = js.native
		def invert(): Matrix4 = js.native
		def scale(v: Vector3): Matrix4 = js.native
		def getMaxScaleOnAxis(): Double = js.native
		def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
		def makeRotationX(theta: Double): Matrix4 = js.native
		def makeRotationY(theta: Double): Matrix4 = js.native
		def makeRotationZ(theta: Double): Matrix4 = js.native
		def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
		def makeScale(x: Double, y: Double, z: Double): Matrix4 = js.native
		def makeShear(xy: Double, xz: Double, yx: Double, yz: Double, zx: Double, zy: Double): Matrix4 = js.native
		def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
		def decompose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
		def makePerspective(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
		def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
		def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 = js.native
		def equals(matrix: Matrix4): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): Matrix4 = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: js.UndefOr[Matrix4Tuple] = js.undefined, offset: js.UndefOr[0] = js.undefined): Matrix4Tuple = js.native
		def toArray(array: js.UndefOr[ArrayLike[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def setFromMatrix3(m: Matrix3): Matrix4 = js.native
		def extractPosition(m: Matrix4): Matrix4 = js.native
		def setRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
		def multiplyVector3(v: js.Any): js.Any = js.native
		def multiplyVector4(v: js.Any): js.Any = js.native
		def multiplyVector3Array(array: js.Array[Double]): js.Array[Double] = js.native
		def rotateAxis(v: js.Any): Unit = js.native
		def crossVector(v: js.Any): Unit = js.native
		def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
		def getInverse(matrix: Matrix): Matrix = js.native
	@js.native
	class Euler extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
		val z: Double = js.native;
		val order: String = js.native;
		var isEuler: true = js.native;
		val _onChangeCallback: js.Function0[,Unit] = js.native;


		def set(x: Double, y: Double, z: Double, order: js.UndefOr[String] = js.undefined): Euler = js.native
		def clone(): this.type = js.native
		def copy(euler: Euler): this.type = js.native
		def setFromRotationMatrix(m: Matrix4, order: js.UndefOr[String] = js.undefined, update: js.UndefOr[Boolean] = js.undefined): Euler = js.native
		def setFromQuaternion(q: Quaternion, order: js.UndefOr[String] = js.undefined, update: js.UndefOr[Boolean] = js.undefined): Euler = js.native
		def setFromVector3(v: Vector3, order: js.UndefOr[String] = js.undefined): Euler = js.native
		def reorder(newOrder: String): Euler = js.native
		def equals(euler: Euler): Boolean = js.native
		def fromArray(xyzo: js.Array[js.Any]): Euler = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toVector3(optionalResult: js.UndefOr[Vector3] = js.undefined): Vector3 = js.native
		def _onChange(callback: js.Function0[,Unit]): this.type = js.native
	@js.native
	class Line3 extends js.Object:
		val start: Vector3 = js.native;
		val end: Vector3 = js.native;
		def set(start: js.UndefOr[Vector3] = js.undefined, end: js.UndefOr[Vector3] = js.undefined): Line3 = js.native
		def clone(): this.type = js.native
		def copy(line: Line3): this.type = js.native
		def getCenter(target: Vector3): Vector3 = js.native
		def delta(target: Vector3): Vector3 = js.native
		def distanceSq(): Double = js.native
		def distance(): Double = js.native
		def at(t: Double, target: Vector3): Vector3 = js.native
		def closestPointToPointParameter(point: Vector3, clampToLine: js.UndefOr[Boolean] = js.undefined): Double = js.native
		def closestPointToPoint(point: Vector3, clampToLine: Boolean, target: Vector3): Vector3 = js.native
		def applyMatrix4(matrix: Matrix4): Line3 = js.native
		def equals(line: Line3): Boolean = js.native
	@js.native
	class Frustum extends js.Object:
		val planes: js.Array[Plane] = js.native;
		def set(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane, p5: Plane): Frustum = js.native
		def clone(): this.type = js.native
		def copy(frustum: Frustum): this.type = js.native
		def setFromProjectionMatrix(m: Matrix4): this.type = js.native
		def intersectsObject(object: Object3D): Boolean = js.native
		def intersectsSprite(sprite: Sprite): Boolean = js.native
		def intersectsSphere(sphere: Sphere): Boolean = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def containsPoint(point: Vector3): Boolean = js.native
	type Matrix3Tuple = js.Array[Double]
	@js.nativetrait Matrix extends js.Object:
		val elements: js.Array[Double] = js.native;
		def identity(): Matrix = js.native
		def copy(m: this.type): this.type = js.native
		def multiplyScalar(s: Double): Matrix = js.native
		def determinant(): Double = js.native
		def transpose(): Matrix = js.native
		def invert(): Matrix = js.native
		def clone(): Matrix = js.native
	@js.native
	class Matrix3 extends js.Object:
		val elements: js.Array[Double] = js.native;
		def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): Matrix3 = js.native
		def identity(): Matrix3 = js.native
		def clone(): this.type = js.native
		def copy(m: Matrix3): this.type = js.native
		def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix3 = js.native
		def setFromMatrix4(m: Matrix4): Matrix3 = js.native
		def multiplyScalar(s: Double): Matrix3 = js.native
		def determinant(): Double = js.native
		def invert(): Matrix3 = js.native
		def transpose(): Matrix3 = js.native
		def getNormalMatrix(matrix4: Matrix4): Matrix3 = js.native
		def transposeIntoArray(r: js.Array[Double]): Matrix3 = js.native
		def setUvTransform(tx: Double, ty: Double, sx: Double, sy: Double, rotation: Double, cx: Double, cy: Double): Matrix3 = js.native
		def scale(sx: Double, sy: Double): Matrix3 = js.native
		def rotate(theta: Double): Matrix3 = js.native
		def translate(tx: Double, ty: Double): Matrix3 = js.native
		def equals(matrix: Matrix3): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): Matrix3 = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: js.UndefOr[Matrix3Tuple] = js.undefined, offset: js.UndefOr[0] = js.undefined): Matrix3Tuple = js.native
		def toArray(array: js.UndefOr[ArrayLike[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def multiply(m: Matrix3): Matrix3 = js.native
		def premultiply(m: Matrix3): Matrix3 = js.native
		def multiplyMatrices(a: Matrix3, b: Matrix3): Matrix3 = js.native
		def multiplyVector3(vector: Vector3): js.Any = js.native
		def multiplyVector3Array(a: js.Any): js.Any = js.native
		def getInverse(matrix: Matrix4, throwOnDegenerate: js.UndefOr[Boolean] = js.undefined): Matrix3 = js.native
		def getInverse(matrix: Matrix): Matrix = js.native
		def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
	@js.native
	class Quaternion extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
		val z: Double = js.native;
		val w: Double = js.native;
		var isQuaternion: true = js.native;
		val _onChangeCallback: js.Function0[,Unit] = js.native;
		def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
		def clone(): this.type = js.native
		def copy(q: Quaternion): this.type = js.native
		def setFromEuler(euler: Euler, update: js.UndefOr[Boolean] = js.undefined): Quaternion = js.native
		def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
		def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
		def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
		def angleTo(q: Quaternion): Double = js.native
		def rotateTowards(q: Quaternion, step: Double): Quaternion = js.native
		def identity(): Quaternion = js.native
		def invert(): Quaternion = js.native
		def conjugate(): Quaternion = js.native
		def dot(v: Quaternion): Double = js.native
		def lengthSq(): Double = js.native
		def length(): Double = js.native
		def normalize(): Quaternion = js.native
		def multiply(q: Quaternion): Quaternion = js.native
		def premultiply(q: Quaternion): Quaternion = js.native
		def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
		def slerp(qb: Quaternion, t: Double): Quaternion = js.native
		def slerpQuaternions(qa: Quaternion, qb: Quaternion, t: Double): Quaternion = js.native
		def equals(v: Quaternion): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def _onChange(callback: js.Function0[,Unit]): Quaternion = js.native



		def multiplyVector3(v: js.Any): js.Any = js.native
		def inverse(): Quaternion = js.native
	@js.native
	class Box3 extends js.Object:
		val min: Vector3 = js.native;
		val max: Vector3 = js.native;
		var isBox3: true = js.native;
		def set(min: Vector3, max: Vector3): this.type = js.native
		def setFromArray(array: ArrayLike[Double]): this.type = js.native
		def setFromBufferAttribute(bufferAttribute: BufferAttribute): this.type = js.native
		def setFromPoints(points: js.Array[Vector3]): this.type = js.native
		def setFromCenterAndSize(center: Vector3, size: Vector3): this.type = js.native
		def setFromObject(object: Object3D): this.type = js.native
		def clone(): this.type = js.native
		def copy(box: Box3): this.type = js.native
		def makeEmpty(): this.type = js.native
		def isEmpty(): Boolean = js.native
		def getCenter(target: Vector3): Vector3 = js.native
		def getSize(target: Vector3): Vector3 = js.native
		def expandByPoint(point: Vector3): this.type = js.native
		def expandByVector(vector: Vector3): this.type = js.native
		def expandByScalar(scalar: Double): this.type = js.native
		def expandByObject(object: Object3D): this.type = js.native
		def containsPoint(point: Vector3): Boolean = js.native
		def containsBox(box: Box3): Boolean = js.native
		def getParameter(point: Vector3, target: Vector3): Vector3 = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def intersectsSphere(sphere: Sphere): Boolean = js.native
		def intersectsPlane(plane: Plane): Boolean = js.native
		def intersectsTriangle(triangle: Triangle): Boolean = js.native
		def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def distanceToPoint(point: Vector3): Double = js.native
		def getBoundingSphere(target: Sphere): Sphere = js.native
		def intersect(box: Box3): this.type = js.native
		def union(box: Box3): this.type = js.native
		def applyMatrix4(matrix: Matrix4): this.type = js.native
		def translate(offset: Vector3): this.type = js.native
		def equals(box: Box3): Boolean = js.native
		def empty(): js.Any = js.native
		def isIntersectionBox(b: js.Any): js.Any = js.native
		def isIntersectionSphere(s: js.Any): js.Any = js.native
	
	@js.native
	JSGlobal("THREE")
	object interpolants extends js.Object:
		@js.native
		class QuaternionLinearInterpolant extends js.Object:
			def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
		@js.native
		class DiscreteInterpolant extends js.Object:
			def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
		@js.native
		class CubicInterpolant extends js.Object:
			def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
		@js.native
		class LinearInterpolant extends js.Object:
			def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
	@js.native
	class Interpolant extends js.Object:
		val parameterPositions: js.Any = js.native;
		val sampleValues: js.Any = js.native;
		val valueSize: Double = js.native;
		val resultBuffer: js.Any = js.native;
		def evaluate(time: Double): js.Any = js.native
	type Vector4Tuple = js.Array[Double]
	@js.native
	class Vector4 extends js.Object:
		val x: Double = js.native;
		val y: Double = js.native;
		val z: Double = js.native;
		val w: Double = js.native;
		val width: Double = js.native;
		val height: Double = js.native;
		var isVector4: true = js.native;
		def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
		def setScalar(scalar: Double): this.type = js.native
		def setX(x: Double): this.type = js.native
		def setY(y: Double): this.type = js.native
		def setZ(z: Double): this.type = js.native
		def setW(w: Double): this.type = js.native
		def setComponent(index: Double, value: Double): this.type = js.native
		def getComponent(index: Double): Double = js.native
		def clone(): this.type = js.native
		def copy(v: Vector4): this.type = js.native
		def add(v: Vector4): this.type = js.native
		def addScalar(scalar: Double): this.type = js.native
		def addVectors(a: Vector4, b: Vector4): this.type = js.native
		def addScaledVector(v: Vector4, s: Double): this.type = js.native
		def sub(v: Vector4): this.type = js.native
		def subScalar(s: Double): this.type = js.native
		def subVectors(a: Vector4, b: Vector4): this.type = js.native
		def multiply(v: Vector4): this.type = js.native
		def multiplyScalar(s: Double): this.type = js.native
		def applyMatrix4(m: Matrix4): this.type = js.native
		def divideScalar(s: Double): this.type = js.native
		def setAxisAngleFromQuaternion(q: Quaternion): this.type = js.native
		def setAxisAngleFromRotationMatrix(m: Matrix4): this.type = js.native
		def min(v: Vector4): this.type = js.native
		def max(v: Vector4): this.type = js.native
		def clamp(min: Vector4, max: Vector4): this.type = js.native
		def clampScalar(min: Double, max: Double): this.type = js.native
		def floor(): this.type = js.native
		def ceil(): this.type = js.native
		def round(): this.type = js.native
		def roundToZero(): this.type = js.native
		def negate(): this.type = js.native
		def dot(v: Vector4): Double = js.native
		def lengthSq(): Double = js.native
		def length(): Double = js.native
		def manhattanLength(): Double = js.native
		def normalize(): this.type = js.native
		def setLength(length: Double): this.type = js.native
		def lerp(v: Vector4, alpha: Double): this.type = js.native
		def lerpVectors(v1: Vector4, v2: Vector4, alpha: Double): this.type = js.native
		def equals(v: Vector4): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: js.UndefOr[Vector4Tuple] = js.undefined, offset: js.UndefOr[0] = js.undefined): Vector4Tuple = js.native
		def toArray(array: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
		def random(): this.type = js.native
	@js.native
	class Box2 extends js.Object:
		val min: Vector2 = js.native;
		val max: Vector2 = js.native;
		def set(min: Vector2, max: Vector2): Box2 = js.native
		def setFromPoints(points: js.Array[Vector2]): Box2 = js.native
		def setFromCenterAndSize(center: Vector2, size: Vector2): Box2 = js.native
		def clone(): this.type = js.native
		def copy(box: Box2): this.type = js.native
		def makeEmpty(): Box2 = js.native
		def isEmpty(): Boolean = js.native
		def getCenter(target: Vector2): Vector2 = js.native
		def getSize(target: Vector2): Vector2 = js.native
		def expandByPoint(point: Vector2): Box2 = js.native
		def expandByVector(vector: Vector2): Box2 = js.native
		def expandByScalar(scalar: Double): Box2 = js.native
		def containsPoint(point: Vector2): Boolean = js.native
		def containsBox(box: Box2): Boolean = js.native
		def getParameter(point: Vector2, target: Vector2): Vector2 = js.native
		def intersectsBox(box: Box2): Boolean = js.native
		def clampPoint(point: Vector2, target: Vector2): Vector2 = js.native
		def distanceToPoint(point: Vector2): Double = js.native
		def intersect(box: Box2): Box2 = js.native
		def union(box: Box2): Box2 = js.native
		def translate(offset: Vector2): Box2 = js.native
		def equals(box: Box2): Boolean = js.native
		def empty(): js.Any = js.native
		def isIntersectionBox(b: js.Any): js.Any = js.native
	@js.native
	class Ray extends js.Object:
		val origin: Vector3 = js.native;
		val direction: Vector3 = js.native;
		def set(origin: Vector3, direction: Vector3): Ray = js.native
		def clone(): this.type = js.native
		def copy(ray: Ray): this.type = js.native
		def at(t: Double, target: Vector3): Vector3 = js.native
		def lookAt(v: Vector3): Ray = js.native
		def recast(t: Double): Ray = js.native
		def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def distanceToPoint(point: Vector3): Double = js.native
		def distanceSqToPoint(point: Vector3): Double = js.native
		def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: js.UndefOr[Vector3] = js.undefined, optionalPointOnSegment: js.UndefOr[Vector3] = js.undefined): Double = js.native
		def intersectSphere(sphere: Sphere, target: Vector3): Vector3 | null = js.native
		def intersectsSphere(sphere: Sphere): Boolean = js.native
		def distanceToPlane(plane: Plane): Double = js.native
		def intersectPlane(plane: Plane, target: Vector3): Vector3 | null = js.native
		def intersectsPlane(plane: Plane): Boolean = js.native
		def intersectBox(box: Box3, target: Vector3): Vector3 | null = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, target: Vector3): Vector3 | null = js.native
		def applyMatrix4(matrix4: Matrix4): Ray = js.native
		def equals(ray: Ray): Boolean = js.native
		def isIntersectionBox(b: js.Any): js.Any = js.native
		def isIntersectionPlane(p: js.Any): js.Any = js.native
		def isIntersectionSphere(s: js.Any): js.Any = js.native
	@js.nativetrait HSL extends js.Object:
		val h: Double = js.native;
		val s: Double = js.native;
		val l: Double = js.native;
	@js.native
	class Color extends js.Object:
		var isColor: true = js.native;
		val r: Double = js.native;
		val g: Double = js.native;
		val b: Double = js.native;

		def set(color: ColorRepresentation): Color = js.native
		def setScalar(scalar: Double): Color = js.native
		def setHex(hex: Double): Color = js.native
		def setRGB(r: Double, g: Double, b: Double): Color = js.native
		def setHSL(h: Double, s: Double, l: Double): Color = js.native
		def setStyle(style: String): Color = js.native
		def setColorName(style: String): Color = js.native
		def clone(): this.type = js.native
		def copy(color: Color): this.type = js.native
		def copyGammaToLinear(color: Color, gammaFactor: js.UndefOr[Double] = js.undefined): Color = js.native
		def copyLinearToGamma(color: Color, gammaFactor: js.UndefOr[Double] = js.undefined): Color = js.native
		def convertGammaToLinear(gammaFactor: js.UndefOr[Double] = js.undefined): Color = js.native
		def convertLinearToGamma(gammaFactor: js.UndefOr[Double] = js.undefined): Color = js.native
		def copySRGBToLinear(color: Color): Color = js.native
		def copyLinearToSRGB(color: Color): Color = js.native
		def convertSRGBToLinear(): Color = js.native
		def convertLinearToSRGB(): Color = js.native
		def getHex(): Double = js.native
		def getHexString(): String = js.native
		def getHSL(target: HSL): HSL = js.native
		def getStyle(): String = js.native
		def offsetHSL(h: Double, s: Double, l: Double): this.type = js.native
		def add(color: Color): this.type = js.native
		def addColors(color1: Color, color2: Color): this.type = js.native
		def addScalar(s: Double): this.type = js.native
		def sub(color: Color): this.type = js.native
		def multiply(color: Color): this.type = js.native
		def multiplyScalar(s: Double): this.type = js.native
		def lerp(color: Color, alpha: Double): this.type = js.native
		def lerpColors(color1: Color, color2: Color, alpha: Double): this.type = js.native
		def lerpHSL(color: Color, alpha: Double): this.type = js.native
		def equals(color: Color): Boolean = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(xyz: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
	@js.native
	class SphericalHarmonics3 extends js.Object:
		val coefficients: js.Array[Vector3] = js.native;
		var isSphericalHarmonics3: true = js.native;
		def set(coefficients: js.Array[Vector3]): SphericalHarmonics3 = js.native
		def zero(): SphericalHarmonics3 = js.native
		def add(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
		def addScaledSH(sh: SphericalHarmonics3, s: Double): SphericalHarmonics3 = js.native
		def scale(s: Double): SphericalHarmonics3 = js.native
		def lerp(sh: SphericalHarmonics3, alpha: Double): SphericalHarmonics3 = js.native
		def equals(sh: SphericalHarmonics3): Boolean = js.native
		def copy(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
		def clone(): this.type = js.native
		def fromArray(array: js.Array[Double] | ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def toArray(array: js.UndefOr[js.Array[Double]] = js.undefined, offset: js.UndefOr[Double] = js.undefined): js.Array[Double] = js.native
		def toArray(array: ArrayLike[Double], offset: js.UndefOr[Double] = js.undefined): ArrayLike[Double] = js.native
		def getAt(normal: Vector3, target: Vector3): Vector3 = js.native
		def getIrradianceAt(normal: Vector3, target: Vector3): Vector3 = js.native

	@js.native
	class Sphere extends js.Object:
		val center: Vector3 = js.native;
		val radius: Double = js.native;
		def set(center: Vector3, radius: Double): Sphere = js.native
		def setFromPoints(points: js.Array[Vector3], optionalCenter: js.UndefOr[Vector3] = js.undefined): Sphere = js.native
		def clone(): this.type = js.native
		def copy(sphere: Sphere): this.type = js.native
		def expandByPoint(point: Vector3): this.type = js.native
		def isEmpty(): Boolean = js.native
		def makeEmpty(): this.type = js.native
		def containsPoint(point: Vector3): Boolean = js.native
		def distanceToPoint(point: Vector3): Double = js.native
		def intersectsSphere(sphere: Sphere): Boolean = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def intersectsPlane(plane: Plane): Boolean = js.native
		def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def getBoundingBox(target: Box3): Box3 = js.native
		def applyMatrix4(matrix: Matrix4): Sphere = js.native
		def translate(offset: Vector3): Sphere = js.native
		def equals(sphere: Sphere): Boolean = js.native
		def union(sphere: Sphere): this.type = js.native
		def empty(): js.Any = js.native
	@js.native
	class Triangle extends js.Object:
		val a: Vector3 = js.native;
		val b: Vector3 = js.native;
		val c: Vector3 = js.native;
		def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
		def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): Triangle = js.native
		def clone(): this.type = js.native
		def copy(triangle: Triangle): this.type = js.native
		def getArea(): Double = js.native
		def getMidpoint(target: Vector3): Vector3 = js.native
		def getNormal(target: Vector3): Vector3 = js.native
		def getPlane(target: Plane): Plane = js.native
		def getBarycoord(point: Vector3, target: Vector3): Vector3 = js.native
		def getUV(point: Vector3, uv1: Vector2, uv2: Vector2, uv3: Vector2, target: Vector2): Vector2 = js.native
		def containsPoint(point: Vector3): Boolean = js.native
		def intersectsBox(box: Box3): Boolean = js.native
		def isFrontFacing(direction: Vector3): Boolean = js.native
		def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
		def equals(triangle: Triangle): Boolean = js.native





	@js.native
	class Spherical extends js.Object:
		val radius: Double = js.native;
		val phi: Double = js.native;
		val theta: Double = js.native;
		def set(radius: Double, phi: Double, theta: Double): this.type = js.native
		def clone(): this.type = js.native
		def copy(other: Spherical): this.type = js.native
		def makeSafe(): this.type = js.native
		def setFromVector3(v: Vector3): this.type = js.native
		def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
