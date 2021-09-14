package typings.three.three.objects

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
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.SkinnedMesh")
class SkinnedMesh[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Mesh[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial], useVertexTexture: js.UndefOr[Boolean]) = this()
	val bindMode: String = js.native;
	val bindMatrix: Matrix4 = js.native;
	val bindMatrixInverse: Matrix4 = js.native;
	val skeleton: Skeleton = js.native;
	var isSkinnedMesh: Boolean = js.native;
	def bind(skeleton: Skeleton, bindMatrix: js.UndefOr[Matrix4]): Unit = js.native
	def pose(): Unit = js.native
	def normalizeSkinWeights(): Unit = js.native
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native
	def boneTransform(index: Double, target: Vector3): Vector3 = js.native
val LineStrip: Double = js.native;
val LinePieces: Double = js.native;

@js.native
@JSGlobal("THREE.LineSegments")
class LineSegments[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Line[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	val `type`: "LineSegments" | String = js.native;
	var isLineSegments: Boolean = js.native;

@js.native
@JSGlobal("THREE.Bone")
class Bone extends Object3D:
	var isBone: Boolean = js.native;
	val `type`: String = js.native;

@js.native
@JSGlobal("THREE.Line")
class Line[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	val geometry: TGeometry = js.native;
	val material: TMaterial = js.native;
	val `type`: "Line" | "LineLoop" | "LineSegments" | String = js.native;
	var isLine: Boolean = js.native;
	val morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	val morphTargetDictionary: js.UndefOr[objectType3] = js.native;
	def computeLineDistances(): this.type = js.native
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	def updateMorphTargets(): Unit = js.native

@js.native
@JSGlobal("THREE.Mesh")
class Mesh[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	val geometry: TGeometry = js.native;
	val material: TMaterial = js.native;
	val morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	val morphTargetDictionary: js.UndefOr[objectType3] = js.native;
	var isMesh: Boolean = js.native;
	val `type`: String = js.native;
	def updateMorphTargets(): Unit = js.native
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native

@js.native
@JSGlobal("THREE.Points")
class Points[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	val `type`: String = js.native;
	val morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	val morphTargetDictionary: js.UndefOr[objectType3] = js.native;
	var isPoints: Boolean = js.native;
	val geometry: TGeometry = js.native;
	val material: TMaterial = js.native;
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	def updateMorphTargets(): Unit = js.native

@js.native
@JSGlobal("THREE.Sprite")
class Sprite extends Object3D:
	def this(material: js.UndefOr[SpriteMaterial]) = this()
	val `type`: String = js.native;
	var isSprite: Boolean = js.native;
	val geometry: BufferGeometry = js.native;
	val material: SpriteMaterial = js.native;
	val center: Vector2 = js.native;
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	def copy(source: this.type): this.type = js.native

@js.native
@JSGlobal("THREE.Group")
class Group extends Object3D:
	val `type`: String = js.native;
	var isGroup: Boolean = js.native;

@js.native
@JSGlobal("THREE.LOD")
class LOD extends Object3D:
	val `type`: String = js.native;
	val levels: Array[objectType4] = js.native;
	val autoUpdate: Boolean = js.native;
	var isLOD: Boolean = js.native;
	val objects: js.Array[js.Any] = js.native;
	def addLevel(`object`: Object3D, distance: js.UndefOr[Double]): this.type = js.native
	def getCurrentLevel(): Double = js.native
	def getObjectForDistance(distance: Double): Object3D | Null = js.native
	def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	def update(camera: Camera): Unit = js.native
	def toJSON(meta: js.Any): js.Any = js.native

@js.native
@JSGlobal("THREE.InstancedMesh")
class InstancedMesh[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Mesh[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial], count: Double) = this()
	val count: Double = js.native;
	val instanceColor: Null | BufferAttribute = js.native;
	val instanceMatrix: BufferAttribute = js.native;
	var isInstancedMesh: Boolean = js.native;
	def getColorAt(index: Double, color: Color): Unit = js.native
	def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
	def setColorAt(index: Double, color: Color): Unit = js.native
	def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.LineLoop")
class LineLoop[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Line[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	val `type`: String = js.native;
	var isLineLoop: Boolean = js.native;

@js.native
@JSGlobal("THREE.Skeleton")
class Skeleton extends js.Object:
	def this(bones: js.Array[Bone], boneInverses: js.UndefOr[js.Array[Matrix4]]) = this()
	val uuid: String = js.native;
	val bones: js.Array[Bone] = js.native;
	val boneInverses: js.Array[Matrix4] = js.native;
	val boneMatrices: Float32Array = js.native;
	val boneTexture: Null | DataTexture = js.native;
	val boneTextureSize: Double = js.native;
	val frame: Double = js.native;
	val useVertexTexture: Boolean = js.native;
	def init(): Unit = js.native
	def calculateInverses(): Unit = js.native
	def computeBoneTexture(): this.type = js.native
	def pose(): Unit = js.native
	def update(): Unit = js.native
	def clone(): Skeleton = js.native
	def getBoneByName(name: String): js.UndefOr[Bone] = js.native
	def dispose(): Unit = js.native

@js.native
sealed trait objectType3 extends js.Object:
	@JSBracketAccess
	def apply(key: String): Double = js.native

@js.native
sealed trait objectType4 extends js.Object:
	val distance: Double = js.native;
	val `object`: Object3D = js.native;
