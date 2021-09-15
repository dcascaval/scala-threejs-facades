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
	var bindMode: String = js.native;
	var bindMatrix: Matrix4 = js.native;
	var bindMatrixInverse: Matrix4 = js.native;
	var skeleton: Skeleton = js.native;
	val isSkinnedMesh: Boolean = js.native;
	def bind(skeleton: Skeleton, bindMatrix: js.UndefOr[Matrix4]): Unit = js.native
	def pose(): Unit = js.native
	def normalizeSkinWeights(): Unit = js.native

	def boneTransform(index: Double, target: Vector3): Vector3 = js.native
@js.native
@JSGlobal("THREE.LineStrip")
val LineStrip: Double = js.native;
@js.native
@JSGlobal("THREE.LinePieces")
val LinePieces: Double = js.native;

@js.native
@JSGlobal("THREE.LineSegments")
class LineSegments[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Line[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()

	val isLineSegments: Boolean = js.native;

@js.native
@JSGlobal("THREE.Bone")
class Bone extends Object3D:
	val isBone: Boolean = js.native;


@js.native
@JSGlobal("THREE.Line")
class Line[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	var geometry: TGeometry = js.native;
	var material: TMaterial = js.native;

	val isLine: Boolean = js.native;
	var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	var morphTargetDictionary: js.UndefOr[objectType2] = js.native;
	def computeLineDistances(): this.type = js.native

	def updateMorphTargets(): Unit = js.native

@js.native
@JSGlobal("THREE.Mesh")
class Mesh[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()
	var geometry: TGeometry = js.native;
	var material: TMaterial = js.native;
	var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	var morphTargetDictionary: js.UndefOr[objectType2] = js.native;
	val isMesh: Boolean = js.native;

	def updateMorphTargets(): Unit = js.native


@js.native
@JSGlobal("THREE.Points")
class Points[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Object3D:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()

	var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native;
	var morphTargetDictionary: js.UndefOr[objectType2] = js.native;
	val isPoints: Boolean = js.native;
	var geometry: TGeometry = js.native;
	var material: TMaterial = js.native;

	def updateMorphTargets(): Unit = js.native

@js.native
@JSGlobal("THREE.Sprite")
class Sprite extends Object3D:
	def this(material: js.UndefOr[SpriteMaterial]) = this()

	val isSprite: Boolean = js.native;
	var geometry: BufferGeometry = js.native;
	var material: SpriteMaterial = js.native;
	var center: Vector2 = js.native;



@js.native
@JSGlobal("THREE.Group")
class Group extends Object3D:

	val isGroup: Boolean = js.native;

@js.native
@JSGlobal("THREE.LOD")
class LOD extends Object3D:

	var levels: Array[objectType3] = js.native;
	var autoUpdate: Boolean = js.native;
	val isLOD: Boolean = js.native;
	var objects: js.Array[js.Any] = js.native;
	def addLevel(`object`: Object3D, distance: js.UndefOr[Double]): this.type = js.native
	def getCurrentLevel(): Double = js.native
	def getObjectForDistance(distance: Double): Object3D | Null = js.native

	def update(camera: Camera): Unit = js.native


@js.native
@JSGlobal("THREE.InstancedMesh")
class InstancedMesh[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Mesh[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial], count: Double) = this()
	var count: Double = js.native;
	var instanceColor: Null | BufferAttribute = js.native;
	var instanceMatrix: BufferAttribute = js.native;
	val isInstancedMesh: Boolean = js.native;
	def getColorAt(index: Double, color: Color): Unit = js.native
	def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
	def setColorAt(index: Double, color: Color): Unit = js.native
	def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.LineLoop")
class LineLoop[TGeometry <: BufferGeometry,TMaterial <: Material | js.Array[Material]] extends Line[TGeometry,TMaterial]:
	def this(geometry: js.UndefOr[TGeometry], material: js.UndefOr[TMaterial]) = this()

	val isLineLoop: Boolean = js.native;

@js.native
@JSGlobal("THREE.Skeleton")
class Skeleton extends js.Object:
	def this(bones: js.Array[Bone], boneInverses: js.UndefOr[js.Array[Matrix4]]) = this()
	var uuid: String = js.native;
	var bones: js.Array[Bone] = js.native;
	var boneInverses: js.Array[Matrix4] = js.native;
	var boneMatrices: Float32Array = js.native;
	var boneTexture: Null | DataTexture = js.native;
	var boneTextureSize: Double = js.native;
	var frame: Double = js.native;
	var useVertexTexture: Boolean = js.native;
	def init(): Unit = js.native
	def calculateInverses(): Unit = js.native
	def computeBoneTexture(): this.type = js.native
	def pose(): Unit = js.native
	def update(): Unit = js.native
	@JSName("clone")
	def jsClone(): Skeleton = js.native
	def getBoneByName(name: String): js.UndefOr[Bone] = js.native
	def dispose(): Unit = js.native

@js.native
sealed trait objectType2 extends js.Object:
	@JSBracketAccess
	def apply(key: String): Double = js.native

@js.native
sealed trait objectType3 extends js.Object:
	var distance: Double = js.native;
	var `object`: Object3D = js.native;
