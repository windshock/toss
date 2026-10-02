// entry=0x110870

void H110870(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  uint in_w8;
  long *in_x9;
  ulong uVar3;
  int iVar4;
  undefined8 *puVar5;
  long unaff_x29;
  
  if (0 < (int)in_w8) {
    iVar4 = (int)in_x9[3];
    uVar3 = 0;
    do {
      if (iVar4 < 0) {
        iVar4 = (iVar4 - ((-(int)DAT_00279e80 | 0x213ecc38U) * 2 -
                          (-(int)DAT_00279e80 ^ 0x213ecc38U) ^ 0xffffffff)) + -1;
        *(int *)(in_x9 + 3) = iVar4;
        if (iVar4 < (int)((-(int)DAT_00279e80 | 0x213ecc31U) * 2 -
                         (-(int)DAT_00279e80 ^ 0x213ecc31U))) {
                    /* WARNING: Could not recover jumptable at 0x00210660. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR_LAB_00275c00)();
          return;
        }
      }
      puVar5 = (undefined8 *)*in_x9;
      *in_x9 = (long)puVar5 +
               (-DAT_00279e80 | 0xf1df4d21213ecc38U) + (-DAT_00279e80 & 0xf1df4d21213ecc38U);
      *(undefined8 *)
       (&stack0x00000000 + (uVar3 * 8 - ((ulong)in_w8 * 8 + 0xf & 0xfffffffffffffff0))) = *puVar5;
      uVar3 = uVar3 + 1;
    } while (uVar3 != in_w8);
  }
  uVar1 = -(int)DAT_00279e80;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(0x213ecc2f - (-(int)DAT_00279e80 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 | 0x213eccaf) * 2 - (uVar1 ^ 0x213eccaf))])
            (1,param_2,param_3,param_2,in_w8);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) != *(long *)(unaff_x29 + -0x18)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


