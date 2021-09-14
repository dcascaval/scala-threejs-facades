package typings.three.three.core

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
sealed trait Event extends js.Object:
	val `type`: String = js.native;
	val target: js.UndefOr[js.Any] = js.native;
	@JSBracketAccess
	def apply(attachment: String): js.Any = js.native

@js.native
@JSGlobal("THREE.EventDispatcher")
class EventDispatcher extends js.Object:
	def addEventListener(`type`: String, listener: js.Function1[Event,Unit]): Unit = js.native
	def hasEventListener(`type`: String, listener: js.Function1[Event,Unit]): Boolean = js.native
	def removeEventListener(`type`: String, listener: js.Function1[Event,Unit]): Unit = js.native
	def dispatchEvent(event: objectType16): Unit = js.native

@js.native
@JSGlobal("THREE.InterleavedBufferAttribute")
class InterleavedBufferAttribute extends js.Object:
	def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double, normalized: js.UndefOr[Boolean]) = this()
	val name: String = js.native;
	val data: InterleavedBuffer = js.native;
	val itemSize: Double = js.native;
	val offset: Double = js.native;
	val normalized: Boolean = js.native;
	var isInterleavedBufferAttribute: Boolean = js.native;
	def count(): Double = js.native
	def array(): ArrayLike[Double] = js.native
	def needsUpdate(value: Boolean): Unit = js.native
	def applyMatrix4(m: Matrix4): this.type = js.native
	def clone(data: js.UndefOr[js.Object]): BufferAttribute = js.native
	def getX(index: Double): Double = js.native
	def setX(index: Double, x: Double): this.type = js.native
	def getY(index: Double): Double = js.native
	def setY(index: Double, y: Double): this.type = js.native
	def getZ(index: Double): Double = js.native
	def setZ(index: Double, z: Double): this.type = js.native
	def getW(index: Double): Double = js.native
	def setW(index: Double, z: Double): this.type = js.native
	def setXY(index: Double, x: Double, y: Double): this.type = js.native
	def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
	def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
	def toJSON(data: js.UndefOr[js.Object]): objectType17 = js.native
	def applyNormalMatrix(matrix: Matrix): this.type = js.native
	def transformDirection(matrix: Matrix): this.type = js.native

@js.native
@JSGlobal("THREE.InstancedBufferGeometry")
class InstancedBufferGeometry extends BufferGeometry:
	val `type`: String = js.native;
	val isInstancedBufferGeometry: Boolean = js.native;
	val groups: Array[objectType18] = js.native;
	val instanceCount: Double = js.native;
	def addGroup(start: Double, count: Double, instances: Double): Unit = js.native

@js.native
@JSGlobal("THREE.Clock")
class Clock extends js.Object:
	def this(autoStart: js.UndefOr[Boolean]) = this()
	val autoStart: Boolean = js.native;
	val startTime: Double = js.native;
	val oldTime: Double = js.native;
	val elapsedTime: Double = js.native;
	val running: Boolean = js.native;
	def start(): Unit = js.native
	def stop(): Unit = js.native
	def getElapsedTime(): Double = js.native
	def getDelta(): Double = js.native

@js.native
@JSGlobal("THREE.Uniform")
class Uniform extends js.Object:
	def this(value: js.Any) = this()
	def this(`type`: String, value: js.Any) = this()
	val `type`: String = js.native;
	val value: js.Any = js.native;
	val dynamic: Boolean = js.native;
	val onUpdateCallback: js.Function0[Unit] = js.native;
	def onUpdate(callback: js.Function0[Unit]): Uniform = js.native

@js.native
@JSGlobal("THREE.Object3D")
class Object3D extends EventDispatcher:
	val id: Double = js.native;
	val uuid: String = js.native;
	val name: String = js.native;
	val `type`: String = js.native;
	val parent: Object3D | Null = js.native;
	val children: js.Array[Object3D] = js.native;
	val up: Vector3 = js.native;
	var position: Vector3 = js.native;
	var rotation: Euler = js.native;
	var quaternion: Quaternion = js.native;
	var scale: Vector3 = js.native;
	var modelViewMatrix: Matrix4 = js.native;
	var normalMatrix: Matrix3 = js.native;
	val matrix: Matrix4 = js.native;
	val matrixWorld: Matrix4 = js.native;
	val matrixAutoUpdate: Boolean = js.native;
	val matrixWorldNeedsUpdate: Boolean = js.native;
	val layers: Layers = js.native;
	val visible: Boolean = js.native;
	val castShadow: Boolean = js.native;
	val receiveShadow: Boolean = js.native;
	val frustumCulled: Boolean = js.native;
	val renderOrder: Double = js.native;
	val animations: js.Array[AnimationClip] = js.native;
	val userData: objectType19 = js.native;
	val customDepthMaterial: Material = js.native;
	val customDistanceMaterial: Material = js.native;
	var isObject3D: Boolean = js.native;
	val onBeforeRender: js.Function6[WebGLRenderer,Scene,Camera,BufferGeometry,Material,Group,Unit] = js.native;
	val onAfterRender: js.Function6[WebGLRenderer,Scene,Camera,BufferGeometry,Material,Group,Unit] = js.native;


	def applyMatrix4(matrix: Matrix4): Unit = js.native
	def applyQuaternion(quaternion: Quaternion): this.type = js.native
	def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
	def setRotationFromEuler(euler: Euler): Unit = js.native
	def setRotationFromMatrix(m: Matrix4): Unit = js.native
	def setRotationFromQuaternion(q: Quaternion): Unit = js.native
	def rotateOnAxis(axis: Vector3, angle: Double): this.type = js.native
	def rotateOnWorldAxis(axis: Vector3, angle: Double): this.type = js.native
	def rotateX(angle: Double): this.type = js.native
	def rotateY(angle: Double): this.type = js.native
	def rotateZ(angle: Double): this.type = js.native
	def translateOnAxis(axis: Vector3, distance: Double): this.type = js.native
	def translateX(distance: Double): this.type = js.native
	def translateY(distance: Double): this.type = js.native
	def translateZ(distance: Double): this.type = js.native
	def localToWorld(vector: Vector3): Vector3 = js.native
	def worldToLocal(vector: Vector3): Vector3 = js.native
	def lookAt(vector: Vector3 | Double, y: js.UndefOr[Double], z: js.UndefOr[Double]): Unit = js.native
	def add(`object` : (js.Array[Object3D])*): this.type = js.native
	def remove(`object` : (js.Array[Object3D])*): this.type = js.native
	def removeFromParent(): this.type = js.native
	def clear(): this.type = js.native
	def attach(`object`: Object3D): this.type = js.native
	def getObjectById(id: Double): js.UndefOr[Object3D] = js.native
	def getObjectByName(name: String): js.UndefOr[Object3D] = js.native
	def getObjectByProperty(name: String, value: String): js.UndefOr[Object3D] = js.native
	def getWorldPosition(target: Vector3): Vector3 = js.native
	def getWorldQuaternion(target: Quaternion): Quaternion = js.native
	def getWorldScale(target: Vector3): Vector3 = js.native
	def getWorldDirection(target: Vector3): Vector3 = js.native
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	def traverse(callback: js.Function1[Object3D,js.Any]): Unit = js.native
	def traverseVisible(callback: js.Function1[Object3D,js.Any]): Unit = js.native
	def traverseAncestors(callback: js.Function1[Object3D,js.Any]): Unit = js.native
	def updateMatrix(): Unit = js.native
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native
	def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit = js.native
	def toJSON(meta: js.UndefOr[objectType20]): js.Any = js.native
	def clone(recursive: js.UndefOr[Boolean]): this.type = js.native
	def copy(source: this.type, recursive: js.UndefOr[Boolean]): this.type = js.native

object Object3D:
	val DefaultUp: Vector3 = js.native;
	val DefaultMatrixAutoUpdate: Boolean = js.native;

@js.native
@JSGlobal("THREE.BufferGeometryUtils")
object BufferGeometryUtils extends js.Object:
	def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
	def computeTangents(geometry: BufferGeometry): Null = js.native
	def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native

@js.native
@JSGlobal("THREE.GeometryUtils")
object GeometryUtils extends js.Object:
	def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.UndefOr[js.Any]): js.Any = js.native
	def center(geometry: js.Any): js.Any = js.native

@js.native
@JSGlobal("THREE.InstancedBufferAttribute")
class InstancedBufferAttribute extends BufferAttribute:
	def this(array: ArrayLike[Double], itemSize: Double, normalized: js.UndefOr[Boolean], meshPerAttribute: js.UndefOr[Double]) = this()
	val meshPerAttribute: Double = js.native;

@js.native
sealed trait Face extends js.Object:
	val a: Double = js.native;
	val b: Double = js.native;
	val c: Double = js.native;
	val normal: Vector3 = js.native;
	val materialIndex: Double = js.native;

@js.native
sealed trait Intersection extends js.Object:
	val distance: Double = js.native;
	val distanceToRay: js.UndefOr[Double] = js.native;
	val point: Vector3 = js.native;
	val index: js.UndefOr[Double] = js.native;
	val face: js.UndefOr[Face | Null] = js.native;
	val faceIndex: js.UndefOr[Double] = js.native;
	val `object`: Object3D = js.native;
	val uv: js.UndefOr[Vector2] = js.native;
	val instanceId: js.UndefOr[Double] = js.native;

@js.native
sealed trait RaycasterParameters extends js.Object:
	val Mesh: js.UndefOr[js.Any] = js.native;
	val Line: js.UndefOr[objectType21] = js.native;
	val LOD: js.UndefOr[js.Any] = js.native;
	val Points: js.UndefOr[objectType21] = js.native;
	val Sprite: js.UndefOr[js.Any] = js.native;

@js.native
@JSGlobal("THREE.Raycaster")
class Raycaster extends js.Object:
	def this(origin: js.UndefOr[Vector3], direction: js.UndefOr[Vector3], near: js.UndefOr[Double], far: js.UndefOr[Double]) = this()
	val ray: Ray = js.native;
	val near: Double = js.native;
	val far: Double = js.native;
	val camera: Camera = js.native;
	val layers: Layers = js.native;
	val params: RaycasterParameters = js.native;
	def set(origin: Vector3, direction: Vector3): Unit = js.native
	def setFromCamera(coords: objectType22, camera: Camera): Unit = js.native
	def intersectObject(`object`: Object3D, recursive: js.UndefOr[Boolean], optionalTarget: js.UndefOr[js.Array[Intersection]]): js.Array[Intersection] = js.native
	def intersectObjects(objects: js.Array[Object3D], recursive: js.UndefOr[Boolean], optionalTarget: js.UndefOr[js.Array[Intersection]]): js.Array[Intersection] = js.native

@js.native
@JSGlobal("THREE.GLBufferAttribute")
class GLBufferAttribute extends js.Object:
	def this(buffer: WebGLBuffer, `type`: Double, itemSize: Double, elementSize: 1 | 2 | 4, count: Double) = this()
	val buffer: WebGLBuffer = js.native;
	val `type`: Double = js.native;
	val itemSize: Double = js.native;
	val elementSize: 1 | 2 | 4 = js.native;
	val count: Double = js.native;
	val version: Double = js.native;
	var isGLBufferAttribute: Boolean = js.native;
	def needsUpdate(value: Boolean): Unit = js.native
	def setBuffer(buffer: WebGLBuffer): this.type = js.native
	def setType(`type`: Double, elementSize: 1 | 2 | 4): this.type = js.native
	def setItemSize(itemSize: Double): this.type = js.native
	def setCount(count: Double): this.type = js.native

@js.native
@JSGlobal("THREE.BufferGeometry")
class BufferGeometry extends EventDispatcher:

	val id: Double = js.native;
	val uuid: String = js.native;
	val name: String = js.native;
	val `type`: String = js.native;
	val index: BufferAttribute | Null = js.native;
	val attributes: objectType23 = js.native;
	val morphAttributes: objectType24 = js.native;
	val morphTargetsRelative: Boolean = js.native;
	val groups: Array[objectType25] = js.native;
	val boundingBox: Box3 | Null = js.native;
	val boundingSphere: Sphere | Null = js.native;
	val drawRange: objectType26 = js.native;
	val userData: objectType19 = js.native;
	var isBufferGeometry: Boolean = js.native;
	val drawcalls: js.Any = js.native;
	val offsets: js.Any = js.native;
	def getIndex(): BufferAttribute | Null = js.native
	def setIndex(index: BufferAttribute | js.Array[Double] | Null): BufferGeometry = js.native
	def setAttribute(name: BuiltinShaderAttributeName | js.Any, attribute: BufferAttribute | InterleavedBufferAttribute): BufferGeometry = js.native
	def getAttribute(name: BuiltinShaderAttributeName | js.Any): BufferAttribute | InterleavedBufferAttribute = js.native
	def deleteAttribute(name: BuiltinShaderAttributeName | js.Any): BufferGeometry = js.native
	def hasAttribute(name: BuiltinShaderAttributeName | js.Any): Boolean = js.native
	def addGroup(start: Double, count: Double, materialIndex: js.UndefOr[Double]): Unit = js.native
	def clearGroups(): Unit = js.native
	def setDrawRange(start: Double, count: Double): Unit = js.native
	def applyMatrix4(matrix: Matrix4): BufferGeometry = js.native
	def applyQuaternion(q: Quaternion): BufferGeometry = js.native
	def rotateX(angle: Double): BufferGeometry = js.native
	def rotateY(angle: Double): BufferGeometry = js.native
	def rotateZ(angle: Double): BufferGeometry = js.native
	def translate(x: Double, y: Double, z: Double): BufferGeometry = js.native
	def scale(x: Double, y: Double, z: Double): BufferGeometry = js.native
	def lookAt(v: Vector3): Unit = js.native
	def center(): BufferGeometry = js.native
	def setFromPoints(points: js.Array[Vector3] | js.Array[Vector2]): BufferGeometry = js.native
	def computeBoundingBox(): Unit = js.native
	def computeBoundingSphere(): Unit = js.native
	def computeTangents(): Unit = js.native
	def computeVertexNormals(): Unit = js.native
	def merge(geometry: BufferGeometry, offset: js.UndefOr[Double]): BufferGeometry = js.native
	def normalizeNormals(): Unit = js.native
	def toNonIndexed(): BufferGeometry = js.native
	def toJSON(): js.Any = js.native
	def clone(): BufferGeometry = js.native
	def copy(source: BufferGeometry): this.type = js.native
	def dispose(): Unit = js.native
	def addIndex(index: js.Any): Unit = js.native
	def addDrawCall(start: js.Any, count: js.Any, indexOffset: js.UndefOr[js.Any]): Unit = js.native
	def clearDrawCalls(): Unit = js.native
	def addAttribute(name: String, attribute: BufferAttribute | InterleavedBufferAttribute): BufferGeometry = js.native
	def addAttribute(name: js.Any, array: js.Any, itemSize: js.Any): js.Any = js.native
	def removeAttribute(name: String): BufferGeometry = js.native

object BufferGeometry:
	val MaxIndex: Double = js.native;

@js.native
@JSGlobal("THREE.InstancedInterleavedBuffer")
class InstancedInterleavedBuffer extends InterleavedBuffer:
	def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: js.UndefOr[Double]) = this()
	val meshPerAttribute: Double = js.native;

@js.native
@JSGlobal("THREE.Layers")
class Layers extends js.Object:
	val mask: Double = js.native;
	def set(channel: Double): Unit = js.native
	def enable(channel: Double): Unit = js.native
	def enableAll(): Unit = js.native
	def toggle(channel: Double): Unit = js.native
	def disable(channel: Double): Unit = js.native
	def disableAll(): Unit = js.native
	def test(layers: Layers): Boolean = js.native

@js.native
@JSGlobal("THREE.BufferAttribute")
class BufferAttribute extends js.Object:
	def this(array: ArrayLike[Double], itemSize: Double, normalized: js.UndefOr[Boolean]) = this()
	val name: String = js.native;
	val array: ArrayLike[Double] = js.native;
	val itemSize: Double = js.native;
	val usage: Usage = js.native;
	val updateRange: objectType27 = js.native;
	val version: Double = js.native;
	val normalized: Boolean = js.native;
	val count: Double = js.native;
	var isBufferAttribute: Boolean = js.native;
	val onUploadCallback: js.Function0[Unit] = js.native;
	def needsUpdate(value: Boolean): Unit = js.native
	def onUpload(callback: js.Function0[Unit]): this.type = js.native
	def setUsage(usage: Usage): this.type = js.native
	def clone(): this.type = js.native
	def copy(source: BufferAttribute): this.type = js.native
	def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): this.type = js.native
	def copyArray(array: ArrayLike[Double]): this.type = js.native
	def copyColorsArray(colors: Array[objectType28]): this.type = js.native
	def copyVector2sArray(vectors: Array[objectType22]): this.type = js.native
	def copyVector3sArray(vectors: Array[objectType29]): this.type = js.native
	def copyVector4sArray(vectors: Array[objectType30]): this.type = js.native
	def applyMatrix3(m: Matrix3): this.type = js.native
	def applyMatrix4(m: Matrix4): this.type = js.native
	def applyNormalMatrix(m: Matrix3): this.type = js.native
	def transformDirection(m: Matrix4): this.type = js.native
	def set(value: ArrayLike[Double] | ArrayBufferView, offset: js.UndefOr[Double]): this.type = js.native
	def getX(index: Double): Double = js.native
	def setX(index: Double, x: Double): this.type = js.native
	def getY(index: Double): Double = js.native
	def setY(index: Double, y: Double): this.type = js.native
	def getZ(index: Double): Double = js.native
	def setZ(index: Double, z: Double): this.type = js.native
	def getW(index: Double): Double = js.native
	def setW(index: Double, z: Double): this.type = js.native
	def setXY(index: Double, x: Double, y: Double): this.type = js.native
	def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
	def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
	def toJSON(): objectType31 = js.native

@js.native
@JSGlobal("THREE.Int8Attribute")
class Int8Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Uint8Attribute")
class Uint8Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Uint8ClampedAttribute")
class Uint8ClampedAttribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Int16Attribute")
class Int16Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Uint16Attribute")
class Uint16Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Int32Attribute")
class Int32Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Uint32Attribute")
class Uint32Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Float32Attribute")
class Float32Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Float64Attribute")
class Float64Attribute extends BufferAttribute:
	def this(array: js.Any, itemSize: Double) = this()

@js.native
@JSGlobal("THREE.Int8BufferAttribute")
class Int8BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Uint8BufferAttribute")
class Uint8BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Uint8ClampedBufferAttribute")
class Uint8ClampedBufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Int16BufferAttribute")
class Int16BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Uint16BufferAttribute")
class Uint16BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Int32BufferAttribute")
class Int32BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Uint32BufferAttribute")
class Uint32BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Float16BufferAttribute")
class Float16BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Float32BufferAttribute")
class Float32BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.Float64BufferAttribute")
class Float64BufferAttribute extends BufferAttribute:
	def this(array: Iterable[Double] | ArrayLike[Double] | ArrayBuffer | Double, itemSize: Double, normalized: js.UndefOr[Boolean]) = this()

@js.native
@JSGlobal("THREE.InterleavedBuffer")
class InterleavedBuffer extends js.Object:
	def this(array: ArrayLike[Double], stride: Double) = this()
	val array: ArrayLike[Double] = js.native;
	val stride: Double = js.native;
	val usage: Usage = js.native;
	val updateRange: objectType27 = js.native;
	val version: Double = js.native;
	val length: Double = js.native;
	val count: Double = js.native;
	val needsUpdate: Boolean = js.native;
	val uuid: String = js.native;
	def setUsage(usage: Usage): InterleavedBuffer = js.native
	def clone(data: js.Object): InterleavedBuffer = js.native
	def copy(source: InterleavedBuffer): this.type = js.native
	def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
	def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
	def toJSON(data: js.Object): objectType32 = js.native

@js.native
sealed trait objectType16 extends js.Object:
	val `type`: String = js.native;
	@JSBracketAccess
	def apply(attachment: String): js.Any = js.native

@js.native
sealed trait objectType22 extends js.Object:
	val x: Double = js.native;
	val y: Double = js.native;

@js.native
sealed trait objectType21 extends js.Object:
	val threshold: Double = js.native;

@js.native
sealed trait objectType25 extends js.Object:
	val start: Double = js.native;
	val count: Double = js.native;
	val materialIndex: js.UndefOr[Double] = js.native;

@js.native
sealed trait objectType30 extends js.Object:
	val x: Double = js.native;
	val y: Double = js.native;
	val z: Double = js.native;
	val w: Double = js.native;

@js.native
sealed trait objectType29 extends js.Object:
	val x: Double = js.native;
	val y: Double = js.native;
	val z: Double = js.native;

@js.native
sealed trait objectType28 extends js.Object:
	val r: Double = js.native;
	val g: Double = js.native;
	val b: Double = js.native;

@js.native
sealed trait objectType17 extends js.Object:
	val isInterleavedBufferAttribute: Boolean = js.native;
	val itemSize: Double = js.native;
	val data: String = js.native;
	val offset: Double = js.native;
	val normalized: Boolean = js.native;

@js.native
sealed trait objectType27 extends js.Object:
	val offset: Double = js.native;
	val count: Double = js.native;

@js.native
sealed trait objectType20 extends js.Object:
	val geometries: js.Any = js.native;
	val materials: js.Any = js.native;
	val textures: js.Any = js.native;
	val images: js.Any = js.native;

@js.native
sealed trait objectType26 extends js.Object:
	val start: Double = js.native;
	val count: Double = js.native;

@js.native
sealed trait objectType24 extends js.Object:
	@JSBracketAccess
	def apply(name: String): Array[BufferAttribute | InterleavedBufferAttribute] = js.native

@js.native
sealed trait objectType23 extends js.Object:
	@JSBracketAccess
	def apply(name: String): BufferAttribute | InterleavedBufferAttribute = js.native

@js.native
sealed trait objectType18 extends js.Object:
	val start: Double = js.native;
	val count: Double = js.native;
	val instances: Double = js.native;

@js.native
sealed trait objectType32 extends js.Object:
	val uuid: String = js.native;
	val buffer: String = js.native;
	val `type`: String = js.native;
	val stride: Double = js.native;

@js.native
sealed trait objectType19 extends js.Object:
	@JSBracketAccess
	def apply(key: String): js.Any = js.native

@js.native
sealed trait objectType31 extends js.Object:
	val itemSize: Double = js.native;
	val `type`: String = js.native;
	val array: js.Array[Double] = js.native;
	val normalized: Boolean = js.native;