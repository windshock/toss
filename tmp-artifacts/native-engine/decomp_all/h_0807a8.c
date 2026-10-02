// entry=0x807a8

void H807a8(void)

{
  uint uVar1;
  uint uVar2;
  undefined1 *puVar3;
  long unaff_x29;
  
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)(-0x6b073d07 - (-(int)DAT_00274480 ^ 0xffffffffU))])
            (*(undefined8 *)(unaff_x29 + -0x120));
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  puVar3 = (undefined1 *)
           (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar1 | 0x94f8c2f2) + (uVar1 & 0x94f8c2f2)) * 300 +
                      (long)(int)((uVar2 ^ 0x94f8c407) + (uVar2 & 0x94f8c407) * 2)])
                     (-0x66442ea56b073d0b - (-DAT_00274480 ^ 0xffffffffffffffffU));
  *puVar3 = 0x31;
  puVar3[1] = '!' - (-(char)DAT_00274480 ^ 0xffU);
  puVar3[2] = 0x37;
  puVar3[3] = 0;
                    /* WARNING: Could not recover jumptable at 0x0017c864. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282e30)();
  return;
}


